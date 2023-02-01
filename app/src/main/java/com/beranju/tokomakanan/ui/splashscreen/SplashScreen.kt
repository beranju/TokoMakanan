package com.beranju.tokomakanan.ui.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.beranju.tokomakanan.R
import com.beranju.tokomakanan.ui.auth.AuthActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            startActivity(Intent(this, AuthActivity::class.java))
            finish()
        },3000L);
    }
}