package com.example.bungalaundry

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.btn_login).setOnClickListener{
            if(findViewById<EditText>(R.id.idpegawai).getText().toString().trim().isEmpty() || findViewById<EditText>(R.id.sandi).getText().toString().trim().isEmpty()){
                Toast.makeText(this@Login, "Form Tidak Boleh Kosong!", Toast.LENGTH_SHORT).show()
            } else {
                if(findViewById<EditText>(R.id.idpegawai).getText().toString() == "Bunga laundry" && findViewById<EditText>(R.id.sandi).getText().toString() == "bungalaundry123"){
                    val intent = Intent(this, Beranda::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this@Login, "ID dan Password Salah, Silahkan Coba Lagi!", Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }
}