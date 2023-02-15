package com.beranju.tokomakanan.ui.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.beranju.tokomakanan.databinding.ItemMenuLayoutBinding
import com.beranju.tokomakanan.model.MenuModel


class MenuAdapter(
    private val listData: List<MenuModel>,
    private var onClickMenu: ((MenuModel) -> Unit)? = null
): RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val binding = ItemMenuLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return MenuViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size

    inner class MenuViewHolder(private val binding: ItemMenuLayoutBinding): ViewHolder(binding.root) {
        fun bind(data: MenuModel) {
            binding.tvMenuName.text = data.name
        }
        init {
            binding.ivBtnMove.setOnClickListener {
                onClickMenu?.invoke(listData[adapterPosition])
            }
        }
    }
}
