package com.e.aplikasidoaharian

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class BangunTidurActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bangun_tidur)

        val pindahback: ImageView = findViewById(R.id.btn_backbanguntidur)
        pindahback.setOnClickListener(this)

        val keluarsuara: ImageView = findViewById(R.id.img_audiobanguntidur)
        keluarsuara.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_backbanguntidur -> {
                val move_to_LayoutUtama =
                    Intent(this@BangunTidurActivity, LayoutUtamaActivity::class.java)
                startActivity(move_to_LayoutUtama)

            }

            R.id.img_audiobanguntidur -> {
                val putaraudio = MediaPlayer.create(this, R.raw.audio_banguntidur)
                putaraudio.start()
            }
        }
    }
}