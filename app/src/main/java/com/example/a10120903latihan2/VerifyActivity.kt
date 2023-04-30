package com.example.a10120903latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
/**
 * Tanggal Pengerjaan : 30/04/2023
 * NIM : 10120903
 * Kelas: IF10
 * Nama : Yora Barera
 * */
class VerifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        val btn = findViewById<MaterialButton>(R.id.btnSend)
        btn.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}