package com.example.beaconsmarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class WelcomeBackActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_back)

        val button1 = findViewById<ImageButton>(R.id.fingerprint)

        button1.setOnClickListener {
            val intent = Intent(this, HomeScreenActivity::class.java)

            startActivity(intent)
        }
        val button2 = findViewById<ImageButton>(R.id.signin)

        button2.setOnClickListener {
            val intent = Intent(this, HomeScreenActivity::class.java)

            startActivity(intent)
        }

    }

}