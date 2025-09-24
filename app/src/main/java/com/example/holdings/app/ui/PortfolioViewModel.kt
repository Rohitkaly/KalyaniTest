package com.example.holdings.app.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.holdings.data.HoldingsRepositoryContract
import com.example.holdings.data.local.HoldingEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import java.text.NumberFormat
import java.util.Locale
import javax.inject.Inject

data class PortfolioSummary(
    val currentValue: Double,
    val totalInvestment: Double,
    val totalPNL: Double,
    val todaysPNL: Double
)

data class UiState(
    val holdings: List<HoldingEntity> = emptyList(),
    val summary: PortfolioSummary = PortfolioSummary(0.0,0.0,0.0,0.0),
    val isExpanded: Boolean = false,
    val loading: Boolean = false,
    val error: String? = null
)

@HiltViewModel
class PortfolioViewModel @Inject constructor(private val repo: HoldingsRepositoryContract) : ViewModel() {

    private val _uiState = MutableStateFlow(UiState(loading = true))
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            repo.streamHoldings()
                .onEach { entities ->
                    Log.d("MyTagEntities", "$entities")
                    val summary = calculateSummary(entities)
                    _uiState.value = _uiState.value.copy(holdings = entities, summary = summary, loading = false, error = null)
                }
                .catch { e ->
                    _uiState.value = _uiState.value.copy(error = e.localizedMessage ?: "Unknown", loading = false)
                }
                .collect{}
        }
        refresh()
    }

    fun refresh() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(loading = true, error = null)
            when (val res = repo.refreshFromNetwork()) {
                is com.example.holdings.data.RepoResult.Success -> _uiState.value = _uiState.value.copy(loading = false, error = null)
                is com.example.holdings.data.RepoResult.Error -> _uiState.value = _uiState.value.copy(loading = false, error = res.throwable.localizedMessage ?: "Failed")
            }
        }
    }

    fun toggleExpanded() {
        _uiState.value = _uiState.value.copy(isExpanded = !_uiState.value.isExpanded)
    }

    companion object {
        fun calculateSummary(holdings: List<HoldingEntity>): PortfolioSummary {
            var currentValue = 0.0
            var totalInvestment = 0.0
            var totalPNL = 0.0
            var todaysPNL = 0.0
            holdings.forEach { h ->
                val curVal = h.ltp * h.quantity
                val investment = h.avgPrice * h.quantity
                currentValue += curVal
                totalInvestment += investment
                totalPNL += (curVal - investment)
                todaysPNL += ((h.close - h.ltp) * h.quantity)
            }
            return PortfolioSummary(currentValue, totalInvestment, totalPNL, todaysPNL)
        }

        fun format(amount: Double): String {
            val nf = NumberFormat.getCurrencyInstance(Locale.getDefault())
            return nf.format(amount)
        }
    }
}
