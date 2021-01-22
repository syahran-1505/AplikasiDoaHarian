package com.e.aplikasidoaharian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity(),  View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnpindahstart:ImageView = findViewById(R.id.btn_start2)
        btnpindahstart.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_start2 ->{
                val move_to_layout_utama = Intent(this@MainActivity, LayoutUtamaActivity::class.java)
                startActivity(move_to_layout_utama)
            }
        }
    }
}