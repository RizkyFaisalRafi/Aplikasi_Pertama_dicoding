package com.aplikasipertama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi Komponen
        val edTglLahir = findViewById<EditText>(R.id.ed_tanggallahir)
        val btn_klik = findViewById<Button>(R.id.btn_klik)
        val tvhasil = findViewById<TextView>(R.id.tv_hasil)

        // Memberikan aksi Klik / ketika di klik
        btn_klik.setOnClickListener{
//          Mengambil data dari edit_text
            val input = edTglLahir.text.toString()
//            Mengeceknya sebuah angka jadinya dari string diubah ke integer
//            when dalam java if
//            .. artinya Range / Jarak
            val hasil = when (input.toInt()){
                in 1946..1964 -> "Baby Boomers"
                in 1965..1980 -> "X"
                in 1981..1995 -> "Millenial"
                in 1996..2010 -> "Z"
                else -> "Gak Tau Mas"
            }
            tvhasil.text = "Kamu Generasi $hasil"
        }
    }
}