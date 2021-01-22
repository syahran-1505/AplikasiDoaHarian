package com.e.aplikasidoaharian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_layout_utama.view.*

class LayoutUtamaActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_utama)

    val btnpindahback2 :ImageView = findViewById(R.id.btn_back2)
        btnpindahback2.setOnClickListener(this)

    val btnsebelumtidur : ImageView = findViewById(R.id.btn_sebelumtidur2)
        btnsebelumtidur.setOnClickListener(this)

    val btnbanguntidur : ImageView= findViewById(R.id.btn_banguntidur2)
        btnbanguntidur.setOnClickListener(this)

    val btnsebelumbelajar : ImageView= findViewById(R.id.btn_belajar2)
        btnsebelumbelajar.setOnClickListener(this)

    val btnberpakaian : ImageView= findViewById(R.id.btn_berpakaian2)
        btnberpakaian.setOnClickListener(this)

    val btnmasukpasar : ImageView=findViewById(R.id.btn_masukpasar2)
        btnmasukpasar.setOnClickListener(this)

    val btnnaikkendaraan : ImageView=findViewById(R.id.btn_naikkendaraan2)
        btnnaikkendaraan.setOnClickListener(this)

    val btnortu : ImageView=findViewById(R.id.btn_ortu2)
        btnortu.setOnClickListener(this)

    val btnmusibah : ImageView=findViewById(R.id.btn_musibah2)
        btnmusibah.setOnClickListener(this)



    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_back2 ->{
                val move_to_mainactivity = Intent(this@LayoutUtamaActivity, MainActivity::class.java)
                startActivity(move_to_mainactivity)
            }

            R.id.btn_sebelumtidur2 ->{
                val move_to_sebelumtidur = Intent(this@LayoutUtamaActivity, SebelumTidurActivity::class.java)
                startActivity(move_to_sebelumtidur)
            }

            R.id.btn_banguntidur2 ->{
                val move_to_banguntidur = Intent(this@LayoutUtamaActivity, BangunTidurActivity::class.java)
                startActivity(move_to_banguntidur)
            }

            R.id.btn_belajar2 ->{
                val move_to_belajar = Intent(this@LayoutUtamaActivity, SebelumBelajarActivity::class.java)
                startActivity(move_to_belajar)
            }

            R.id.btn_berpakaian2 ->{
                val move_to_berpakaian = Intent(this@LayoutUtamaActivity, BerpakaianActivity::class.java)
                startActivity(move_to_berpakaian)
            }

            R.id.btn_masukpasar2 ->{
                val move_to_masukpasar = Intent(this@LayoutUtamaActivity, MasukPasarActivity::class.java)
                startActivity(move_to_masukpasar)
            }

            R.id.btn_naikkendaraan2 ->{
                val move_to_naikkendaraan = Intent(this@LayoutUtamaActivity, NaikKendaraanActivity::class.java)
                startActivity(move_to_naikkendaraan)
            }

            R.id.btn_ortu2 ->{
                val move_to_ortu = Intent(this@LayoutUtamaActivity, OrtuActivity::class.java)
                startActivity(move_to_ortu)

            }

            R.id.btn_musibah2 ->{
                val move_to_musibah = Intent(this@LayoutUtamaActivity, MusibahActivity::class.java)
                startActivity(move_to_musibah)



            }


        }
    }
}


