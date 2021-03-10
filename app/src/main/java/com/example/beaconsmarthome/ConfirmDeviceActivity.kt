package com.example.beaconsmarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton


class ConfirmDeviceActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.device_confirm)

        val button1 = findViewById<Button>(R.id.confirmbutton)

        button1.setOnClickListener {
            val intent = Intent(this, DeviceConnectedActivity::class.java)

            startActivity(intent)

            val button2 = findViewById<Button>(R.id.tryagain)

            button1.setOnClickListener {
                val intent = Intent(this, DeviceScanListActivity::class.java)

                startActivity(intent)
                }
            }
    }
}