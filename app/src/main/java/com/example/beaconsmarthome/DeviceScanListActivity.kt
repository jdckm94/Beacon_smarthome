package com.example.beaconsmarthome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class DeviceScanListActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.device_scan_list)

        val button1 = findViewById<ImageButton>(R.id.qrbutton)

        button1.setOnClickListener {
            val intent = Intent(this, QRScanActivity::class.java)

            startActivity(intent)

            val button2 = findViewById<ImageButton>(R.id.backbutton)

            button1.setOnClickListener {
                val intent = Intent(this, AddFirstDeviceActivity::class.java)

                startActivity(intent)
                }
            }

    }

}