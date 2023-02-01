package com.beranju.tokomakanan.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.databinding.ActivityAuthBinding
import com.beranju.tokomakanan.databinding.LayoutToolbarBinding

class AuthActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        val appBarConfiguration = AppBarConfiguration.Builder(
            R.id.FragmentSignIn, R.id.FragmentSignUp, R.id.FragmentSignUpAddress
        ).build()
        val navController = navHostFragment.navController

        binding.toolbar.setupWithNavController(navController, appBarConfiguration)

        navController.addOnDestinationChangedListener { _, destination: NavDestination, _ ->
            when(destination.id){
                R.id.FragmentSignIn -> {
                    visible()
                    setupTitleAndSubtitle("Sign In","Find your best ever meal")
                }
                R.id.FragmentSignUp -> {
                    visible()
                    setupTitleAndSubtitle("Sign Up", "Register and eat")
                    backpressed()
                }
                R.id.FragmentSignUpAddress ->{
                    visible()
                    setupTitleAndSubtitle("Address", "Make sure it's valid")
                    backpressed()
                }
                else -> invisible()
            }
        }

    }

    private fun backpressed() {
        binding.toolbar.navigationIcon = resources.getDrawable(R.drawable.ic_arrow_back_000)
        binding.toolbar.setNavigationOnClickListener { onBackPressed() }
    }

    private fun setupTitleAndSubtitle(title: String, subTitle: String) {
        binding.toolbar.title = title
        binding.toolbar.subtitle = subTitle
    }

    private fun visible() {
        binding.toolbar.visibility = View.VISIBLE
    }

    private fun invisible() {
        binding.toolbar.visibility = View.GONE
    }
}