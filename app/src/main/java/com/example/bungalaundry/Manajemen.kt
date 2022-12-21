package com.example.bungalaundry

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kas_laundry.*

class Manajemen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.manajemen)

        findViewById<ImageButton>(R.id.imageView15).setOnClickListener{
            val intent = Intent(this, KelolaLaundry::class.java)
            startActivity(intent)
        }
        findViewById<ImageButton>(R.id.imageView16).setOnClickListener{
            val intent = Intent(this, RiwayatTransaksi::class.java)
            startActivity(intent)
        }
        findViewById<ImageButton>(R.id.imageView17).setOnClickListener{
            val intent = Intent(this, KasLaundry::class.java)
            startActivity(intent)
        }

    }
}