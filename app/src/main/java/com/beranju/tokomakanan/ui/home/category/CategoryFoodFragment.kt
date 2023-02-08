package com.beranju.tokomakanan.ui.home.category

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.FragmentCategoryFoodBinding
import com.beranju.tokomakanan.model.dummy.HomeModel
import com.beranju.tokomakanan.model.dummy.foodListDummyVertical
import com.beranju.tokomakanan.ui.home.HomeAdapter

class CategoryFoodFragment : Fragment() {

    private var _binding: FragmentCategoryFoodBinding? = null
    private val binding get() = _binding!!
    private lateinit var homeAdapter: HomeAdapter
    private var foodList = ArrayList<HomeModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        when(arguments?.getString(TAB_ARG)){
            TAB_NEW_TASTE -> {
                foodList.addAll(foodListDummyVertical.shuffled())
            }
            TAB_POPULAR -> {
                foodList.addAll(foodListDummyVertical.shuffled())
            }
            TAB_RECOMMENDED -> {
                foodList.addAll(foodListDummyVertical.shuffled())
            }
        }
        homeAdapter = HomeAdapter(foodList, 2){ data->
            Toast.makeText(requireContext(), "${data.title} clicked", Toast.LENGTH_SHORT).show()
        }
        setupRV()
    }

    private fun setupRV() {
        binding.rvFood.apply {
            layoutManager = LinearLayoutManager(requireActivity())
            setHasFixedSize(true)
            adapter = homeAdapter
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryFoodBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        const val TAB_ARG = "tab_arg"
        const val TAB_NEW_TASTE = "News Taste"
        const val TAB_POPULAR = "Popular"
        const val TAB_RECOMMENDED = "Recommended"
    }
}