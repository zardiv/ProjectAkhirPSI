package com.example.bungalaundry

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_manajemen.*
import kotlinx.android.synthetic.main.kas_laundry.*

class Beranda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manajemen)

        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId){
                R.id.manajemen -> {
                    intent = Intent(this, Manajemen::class.java)
                    startActivity(intent)
                }

                R.id.cucian -> {
                    intent = Intent(this, Cucian::class.java)
                    startActivity(intent)
                }
                R.id.data -> {
                    intent = Intent(this, DataPelanggan::class.java)
                    startActivity(intent)
                }

            }
            true
        }

    }
}