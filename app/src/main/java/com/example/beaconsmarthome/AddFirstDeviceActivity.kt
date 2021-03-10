package com.example.beaconsmarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class AddFirstDeviceActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_device)

        val button1 = findViewById<ImageButton>(R.id.addfirstdevice)

        button1.setOnClickListener {
            val intent = Intent(this, DeviceScanListActivity::class.java)

            startActivity(intent)
        }

        val button2 = findViewById<ImageButton>(R.id.backbutton)

        button2.setOnClickListener {
            val intent = Intent(this, HomeScreenActivity::class.java)

            startActivity(intent)
        }


    }

}