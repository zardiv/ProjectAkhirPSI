package com.example.bungalaundry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DataPelanggan : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.data_pelanggan)
        findViewById<Button>(R.id.cari_data).setOnClickListener {
            val intent = Intent(this, CheeseActivity::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.tambah).setOnClickListener {
            val intent = Intent(this, TambahPelanggan::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.edit2).setOnClickListener {
            val intent = Intent(this, Edit::class.java)
            startActivity(intent)
        }
    }
}