package com.beranju.tokomakanan.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.beranju.tokomakanan.ui.home.category.CategoryFoodFragment

class SectionPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int  = 3

    override fun createFragment(position: Int): Fragment {
        val fragment = CategoryFoodFragment()
        val bundle = Bundle()
        when(position){
            0 -> {
                bundle.putString(CategoryFoodFragment.TAB_ARG, CategoryFoodFragment.TAB_NEW_TASTE)
            }
            1 -> {
                bundle.putString(CategoryFoodFragment.TAB_ARG, CategoryFoodFragment.TAB_POPULAR)
            }
            2 -> {
                bundle.putString(CategoryFoodFragment.TAB_ARG, CategoryFoodFragment.TAB_RECOMMENDED)
            }
        }
        fragment.arguments = bundle
        return fragment
    }
}