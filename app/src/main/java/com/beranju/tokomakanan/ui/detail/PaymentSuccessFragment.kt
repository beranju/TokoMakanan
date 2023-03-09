package com.beranju.tokomakanan.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.FragmentPaymentSuccessBinding


class PaymentSuccessFragment : Fragment() {
    private var _binding : FragmentPaymentSuccessBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPaymentSuccessBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}