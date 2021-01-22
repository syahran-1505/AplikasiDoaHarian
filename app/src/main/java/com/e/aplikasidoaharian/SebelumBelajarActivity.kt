package com.e.aplikasidoaharian

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class SebelumBelajarActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sebelum_belajar)

        val pindahback: ImageView = findViewById(R.id.btn_backbelajar)
        pindahback.setOnClickListener(this)

        val keluarsuara: ImageView = findViewById(R.id.img_audiobelajar)
        keluarsuara.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_backbelajar -> {
                val move_to_LayoutUtama =
                    Intent(this@SebelumBelajarActivity, LayoutUtamaActivity::class.java)
                startActivity(move_to_LayoutUtama)

            }
            R.id.img_audiobelajar -> {
                val putaraudio = MediaPlayer.create(this, R.raw.doa_sebelum_belajar)
                putaraudio.start()
            }
        }
    }
}