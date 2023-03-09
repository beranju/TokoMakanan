package com.beranju.tokomakanan.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.widget.ViewPager2
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.FragmentHomeBinding
import com.beranju.tokomakanan.model.dummy.HomeModel
import com.beranju.tokomakanan.model.dummy.foodListDummy
import com.beranju.tokomakanan.model.dummy.foodListDummyVertical
import com.google.android.material.tabs.TabLayout.Tab
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private var foodList = ArrayList<HomeModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sectionPagerAdapter = SectionPagerAdapter(activity as AppCompatActivity)
        val viewPager = binding.viewpager2 as ViewPager2
        viewPager.adapter = sectionPagerAdapter
        val tabs = binding.tabLayout
        TabLayoutMediator(tabs, viewPager ){tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()


        foodList.addAll(foodListDummy)
        val homeAdapter = HomeAdapter(foodList){
            findNavController().navigate(R.id.action_navigation_home_to_detailFragment)
        }
        binding.rvHorizontal.apply {
            layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
            setHasFixedSize(true)
            adapter = homeAdapter
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        private val TAB_TITLES = intArrayOf(
            R.string.tab_new_taste,
            R.string.tab_populer,
            R.string.tab_recommended
        )
    }
}