package com.beranju.tokomakanan.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.FragmentSignUpSuccessBinding

class SignUpSuccessFragment : Fragment() {

    private var _binding: FragmentSignUpSuccessBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpSuccessBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}