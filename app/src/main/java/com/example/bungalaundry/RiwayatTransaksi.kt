package com.example.bungalaundry

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kas_laundry.*

class RiwayatTransaksi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.riwayat_transaksi)

        findViewById<Button>(R.id.cetakNota2).setOnClickListener{
            val intent = Intent(this, Nota::class.java)
            startActivity(intent)
        }
    }
}