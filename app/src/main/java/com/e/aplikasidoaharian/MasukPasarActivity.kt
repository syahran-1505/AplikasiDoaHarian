package com.e.aplikasidoaharian

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MasukPasarActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk_pasar)

        val pindahback: ImageView = findViewById(R.id.btn_backpasar)
        pindahback.setOnClickListener(this)

        val keluarsuara: ImageView = findViewById(R.id.img_audiopasar)
        keluarsuara.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_backpasar -> {
                val move_to_LayoutUtama =
                    Intent(this@MasukPasarActivity, LayoutUtamaActivity::class.java)
                startActivity(move_to_LayoutUtama)

            }

            R.id.img_audiopasar -> {
                val putaraudio = MediaPlayer.create(this, R.raw.doa_ketika_masuk_pasar)
                putaraudio.start()
            }
        }
    }
}