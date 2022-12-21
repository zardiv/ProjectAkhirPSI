package com.example.bungalaundry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TambahPelanggan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tambah_pelanggan)

        findViewById<Button>(R.id.tambah).setOnClickListener {
            if(findViewById<EditText>(R.id.nama_input).getText().toString().trim().isEmpty() || findViewById<EditText>(R.id.alamat_input).getText().toString().trim().isEmpty()){
                Toast.makeText(this@TambahPelanggan, "Form Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this@TambahPelanggan, "Data berhasil ditambahkan", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DataPelanggan::class.java)
                startActivity(intent)
            }
        }
    }
}