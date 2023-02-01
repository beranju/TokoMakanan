package com.beranju.tokomakanan.ui.auth.signin

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.beranju.tokomakanan.MainActivity
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.FragmentSignInBinding
import com.beranju.tokomakanan.ui.auth.AuthActivity
import com.beranju.tokomakanan.ui.auth.signup.SignUpFragment

class SignInFragment : Fragment(){
    private var _binding: FragmentSignInBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        binding.btnSignUp.setOnClickListener {
//            val toSignUp = Intent(requireActivity(), AuthActivity::class.java)
//            toSignUp.putExtra("view", 2)
//            startActivity(toSignUp)
//        }
        binding.btnSignIn.setOnClickListener {
            startActivity(Intent(requireActivity(), MainActivity::class.java))
            activity?.finish()
        }

        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_FragmentSignIn_to_FragmentSignUp)
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSignInBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}