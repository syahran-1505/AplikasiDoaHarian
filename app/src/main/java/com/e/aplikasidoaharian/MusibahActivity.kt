package com.e.aplikasidoaharian

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MusibahActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musibah)

        val pindahback: ImageView = findViewById(R.id.btn_backmusibah)
        pindahback.setOnClickListener(this)

        val keluarsuara: ImageView = findViewById(R.id.img_audiomusibah)
        keluarsuara.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_backmusibah -> {
                val move_to_LayoutUtama =
                    Intent(this@MusibahActivity, LayoutUtamaActivity::class.java)
                startActivity(move_to_LayoutUtama)

            }

            R.id.img_audiomusibah -> {
                val putaraudio = MediaPlayer.create(this, R.raw.doa_ketika_mendapat_musibah)
                putaraudio.start()
            }
        }
    }
}