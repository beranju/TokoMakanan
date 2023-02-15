package com.beranju.tokomakanan.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.FragmentCategoryFoodBinding
import com.beranju.tokomakanan.databinding.FragmentListMenuBinding
import com.beranju.tokomakanan.model.MenuModel
import com.beranju.tokomakanan.model.dummy.HomeModel
import com.beranju.tokomakanan.model.dummy.foodListDummyVertical
import com.beranju.tokomakanan.ui.home.HomeAdapter
import com.beranju.tokomakanan.uitls.AccountMenu
import com.beranju.tokomakanan.uitls.FoodMarketMenu

class ListMenuFragment : Fragment() {

    private var _binding: FragmentListMenuBinding? = null
    private val binding get() = _binding!!
    private var listMenuAccount = AccountMenu.values().map { MenuModel(it.title) }.toList()
    private var listMenuFoodMarket = FoodMarketMenu.values().map { MenuModel(it.title) }.toList()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        when(arguments?.getString(TAB_ARG)){
            TAB_ACCOUNT -> {
                val menuAdapter = MenuAdapter(listMenuAccount){item->
                    //item clicked
                }
                binding.rvMenu.apply {
                    layoutManager = LinearLayoutManager(requireActivity())
                    adapter = menuAdapter
                }
            }
            TAB_FOODMARKET -> {
                val menuAdapter = MenuAdapter(listMenuFoodMarket){item->
                    //itemClicked
                }
                binding.rvMenu.apply {
                    layoutManager = LinearLayoutManager(requireActivity())
                    adapter = menuAdapter
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentListMenuBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        const val TAB_ARG = "tab_arg"
        const val TAB_ACCOUNT = "Account"
        const val TAB_FOODMARKET = "FoodMarket"
    }
}