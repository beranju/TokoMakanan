package com.beranju.tokomakanan.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.FragmentProfileBinding
import com.beranju.tokomakanan.ui.home.HomeFragment
import com.beranju.tokomakanan.ui.profile.SectionPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val sectionPagerAdapter = SectionPagerAdapter(activity as AppCompatActivity)
        val viewPager = binding.viewpager2 as ViewPager2
        viewPager.adapter = sectionPagerAdapter
        val tabs = binding.tabLayout
        TabLayoutMediator(tabs, viewPager ){tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        private val TAB_TITLES = intArrayOf(
            R.string.tab_account,
            R.string.tab_foodmarket,
        )
    }
}