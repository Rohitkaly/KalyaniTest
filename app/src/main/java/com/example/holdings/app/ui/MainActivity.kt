package com.example.holdings.app.ui

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.holdings.app.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private val vm: PortfolioViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = HoldingsAdapter()
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        binding.summaryCollapsed.root.setOnClickListener { vm.toggleExpanded() }
        binding.summaryExpanded.root.setOnClickListener { vm.toggleExpanded() }

        lifecycleScope.launch {
            vm.uiState.collect { state ->
                Log.d("MyTag", "$state")
                adapter.submitList(state.holdings)
                binding.summaryCollapsed.tvCurrentValue.text = PortfolioViewModel.format(state.summary.currentValue)
                binding.summaryCollapsed.tvTotalPnl.text = PortfolioViewModel.format(state.summary.totalPNL)

                binding.summaryExpanded.tvCurrentValue.text = PortfolioViewModel.format(state.summary.currentValue)
                binding.summaryExpanded.tvTotalInvestment.text = PortfolioViewModel.format(state.summary.totalInvestment)
                binding.summaryExpanded.tvTotalPnl.text = PortfolioViewModel.format(state.summary.totalPNL)
                binding.summaryExpanded.tvTodaysPnl.text = PortfolioViewModel.format(state.summary.todaysPNL)

                binding.summaryCollapsed.root.visibility = if (state.isExpanded) View.GONE else View.VISIBLE
                binding.summaryExpanded.root.visibility = if (state.isExpanded) View.VISIBLE else View.GONE
            }
        }
    }
}
