package com.e.aplikasidoaharian

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class NaikKendaraanActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naik_kendaraan)

        val pindahback: ImageView = findViewById(R.id.btn_backkendaraan)
        pindahback.setOnClickListener(this)

        val keluarsuara: ImageView = findViewById(R.id.img_audiokendaraan)
        keluarsuara.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_backkendaraan -> {
                val move_to_LayoutUtama =
                    Intent(this@NaikKendaraanActivity, LayoutUtamaActivity::class.java)
                startActivity(move_to_LayoutUtama)

            }

            R.id.img_audiokendaraan -> {
                val putaraudio = MediaPlayer.create(this, R.raw.doa_naik_kendaraan)
                putaraudio.start()
            }
        }
    }
}