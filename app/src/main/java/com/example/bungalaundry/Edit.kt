package com.example.bungalaundry

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Edit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit)

        findViewById<Button>(R.id.simpan).setOnClickListener {
            if(findViewById<EditText>(R.id.nama_input).getText().toString().trim().isEmpty() || findViewById<EditText>(R.id.alamat_input).getText().toString().trim().isEmpty()){
                Toast.makeText(this@Edit, "Form Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@Edit, "Data berhasil diedit", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, DataPelanggan::class.java)
                startActivity(intent)
            }
        }
    }
}