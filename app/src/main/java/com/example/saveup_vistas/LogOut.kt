package com.example.saveup_vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LogOut : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_out)

        val logOutText = findViewById<TextView>(R.id.log_out_text)
        logOutText.text = "¿Desea cerrar sesión?"

        val bt1 = findViewById<Button>(R.id.log_out_bt1)
        bt1.text = "SI"

        val bt2 = findViewById<Button>(R.id.log_out_bt2)
        bt1.text = "NO"
    }
}