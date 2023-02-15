package com.beranju.tokomakanan.ui.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.beranju.tokomakanan.ui.home.category.CategoryFoodFragment

class SectionPagerAdapter(activity: AppCompatActivity): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int  = 2

    override fun createFragment(position: Int): Fragment {
        val fragment = ListMenuFragment()
        val bundle = Bundle()
        when(position){
            0 -> {
                bundle.putString(ListMenuFragment.TAB_ARG, ListMenuFragment.TAB_ACCOUNT)
            }
            1 -> {
                bundle.putString(ListMenuFragment.TAB_ARG, ListMenuFragment.TAB_FOODMARKET)
            }
        }
        fragment.arguments = bundle
        return fragment
    }
}