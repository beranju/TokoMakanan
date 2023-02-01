package com.beranju.tokomakanan.ui.auth.signup

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.beranju.tokomakanan.MainActivity
import com.beranju.tokomakanan.databinding.FragmentSignUpSuccessBinding

class SignUpSuccessFragment : Fragment() {

    private var _binding: FragmentSignUpSuccessBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFindsFood.setOnClickListener {
            startActivity(Intent(requireActivity(), MainActivity::class.java))
            activity?.finish()
        }

    }

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