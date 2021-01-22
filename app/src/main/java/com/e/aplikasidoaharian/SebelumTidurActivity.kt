package com.e.aplikasidoaharian

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class SebelumTidurActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sebelum_tidur)

        val pindahback: ImageView = findViewById(R.id.btn_backsebelumtidur)
        pindahback.setOnClickListener(this)

        val keluarsuara: ImageView = findViewById(R.id.img_audiosebelumtidur)
        keluarsuara.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_backsebelumtidur -> {
                val move_to_LayoutUtama =
                    Intent(this@SebelumTidurActivity, LayoutUtamaActivity::class.java)
                startActivity(move_to_LayoutUtama)

            }

            R.id.img_audiosebelumtidur -> {
                val putaraudio = MediaPlayer.create(this, R.raw.audio_sebelumtidur)
                putaraudio.start()
            }
        }
    }
}