package com.beranju.tokomakanan.ui.auth.signup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.FragmentSignUpAddressBinding

class SignUpAddressFragment : Fragment() {

    private var _binding : FragmentSignUpAddressBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnSignUpNow.setOnClickListener {
            findNavController().navigate(R.id.action_FragmentSignUpAddress_to_signUpSuccessFragment)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignUpAddressBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}