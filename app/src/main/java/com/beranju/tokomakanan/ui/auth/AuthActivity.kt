package com.beranju.tokomakanan.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavOptions
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.LayoutToolbarBinding
import com.beranju.tokomakanan.ui.auth.signup.SignUpFragment

class AuthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

//
//
//        val pageRequest = intent.getIntExtra("view", 0)
//        if (pageRequest == 2){
//            val navOptions = NavOptions.Builder()
//                .setPopUpTo(R.id.FragmentSignIn, true)
//                .build()
//
//            Navigation.findNavController(findViewById(R.id.nav_host_fragment_container))
//                .navigate(R.id.action_FragmentSignIn_to_FragmentSignUp, null, navOptions)
//        }
    }
}