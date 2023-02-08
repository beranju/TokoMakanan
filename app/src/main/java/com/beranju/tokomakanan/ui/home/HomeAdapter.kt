package com.beranju.tokomakanan.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beranju.tokomakanan.databinding.ItemHomeHorizontalBinding
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.beranju.tokomakanan.databinding.ItemHomeVerticalBinding
import com.beranju.tokomakanan.model.dummy.HomeModel
import com.beranju.tokomakanan.uitls.Helpers.format
import com.bumptech.glide.Glide

private const val HORIZONTAL = 1
private const val VERTICAL = 2

class HomeAdapter(
    private val listData: List<HomeModel>,
    private var viewType: Int = 1,
    var onItemCallback: ((HomeModel) -> Unit)? = null
): RecyclerView.Adapter<ViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if (viewType == HORIZONTAL){
            HorizontalViewHolder(ItemHomeHorizontalBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }else{
            VerticalViewHolder(ItemHomeVerticalBinding.inflate(LayoutInflater.from(parent.context), parent, false))
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = listData[position]
        if (viewType == HORIZONTAL) (holder as HorizontalViewHolder).bind(data)
        if (viewType == VERTICAL) (holder as VerticalViewHolder).bind(data)
    }

    override fun getItemCount(): Int = listData.size

    override fun getItemViewType(position: Int): Int = viewType


    inner class HorizontalViewHolder(private val binding: ItemHomeHorizontalBinding):ViewHolder(binding.root) {
        fun bind(data: HomeModel) {
            binding.apply {
                tvFoodTitle.text = data.title
                rbFoodRate.rating = data.rating
//                Glide.with(itemView.context)
//                    .load(data.src)
//                    .into(ivPoster)
            }
        }
        init{
            binding.root.setOnClickListener {
                onItemCallback?.invoke(listData[adapterPosition])
            }
        }

    }

    inner class VerticalViewHolder(private val binding: ItemHomeVerticalBinding):ViewHolder(binding.root) {
        fun bind(data: HomeModel) {
            binding.apply {
                tvFoodTitle.text = data.title
                tvPrice.format((data.price ?: 0).toString())
                ratingBar.rating = data.rating
//                Glide.with(itemView.context)
//                    .load(data.src)
//                    .into(ivPoster)
            }
        }
        init{
            binding.root.setOnClickListener {
                onItemCallback?.invoke(listData[adapterPosition])
            }
        }

    }
}
