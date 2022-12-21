package com.example.bungalaundry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kelola_laundry)
        findViewById<Button>(R.id.buttonKelola).setOnClickListener{
            val intent = Intent(this, KasLaundry::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.buttonKontak).setOnClickListener{
            val intent = Intent(this, CheeseActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }
}