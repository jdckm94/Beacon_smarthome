package com.example.beaconsmarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HomeScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        val button1 = findViewById<ImageButton>(R.id.BttnAddDevice)

        button1.setOnClickListener {
            val intent = Intent(this, AddFirstDeviceActivity::class.java)

            startActivity(intent)
        }
    }
}