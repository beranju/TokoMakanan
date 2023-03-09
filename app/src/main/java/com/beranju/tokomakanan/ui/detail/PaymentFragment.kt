package com.beranju.tokomakanan.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.FragmentPaymentBinding

class PaymentFragment : Fragment() {
    private var _binding: FragmentPaymentBinding? = null
    private val binding get() = _binding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.toolbar?.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_000, null)
        binding?.toolbar?.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        binding?.btnCheckout?.setOnClickListener {
            findNavController().navigate(R.id.action_paymentFragment_to_paymentSuccessFragment)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPaymentBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}