package com.example.holdings.app.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.holdings.app.databinding.ItemHoldingBinding
import com.example.holdings.data.local.HoldingEntity

class HoldingsAdapter : ListAdapter<HoldingEntity, HoldingsAdapter.HV>(DIFF) {
    companion object {
        val DIFF = object : DiffUtil.ItemCallback<HoldingEntity>() {
            override fun areItemsTheSame(oldItem: HoldingEntity, newItem: HoldingEntity) = oldItem.symbol == newItem.symbol
            override fun areContentsTheSame(oldItem: HoldingEntity, newItem: HoldingEntity) = oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        HV(ItemHoldingBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: HV, position: Int) = holder.bind(getItem(position))

    class HV(private val b: ItemHoldingBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(h: HoldingEntity) {
            b.tvSymbol.text = h.symbol
            b.tvQuantity.text = h.quantity.toString()
            b.tvLtp.text = PortfolioViewModel.format(h.ltp)
            b.tvAvgPrice.text = "Avg: ${PortfolioViewModel.format(h.avgPrice)}"
            val pnl = (h.ltp - h.avgPrice) * h.quantity
            b.tvPnl.text = PortfolioViewModel.format(pnl)
        }
    }
}
