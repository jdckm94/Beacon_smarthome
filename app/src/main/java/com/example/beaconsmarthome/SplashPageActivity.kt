package com.example.beaconsmarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageButton


class SplashPageActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_page)

        Handler().postDelayed({


            startActivity(Intent(this,WelcomeBackActivity::class.java))

            finish()
        }, SPLASH_TIME_OUT)

    }
}