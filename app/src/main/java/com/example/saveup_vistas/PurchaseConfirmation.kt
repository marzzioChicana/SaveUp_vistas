package com.example.saveup_vistas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PurchaseConfirmation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purchase_confirmation)

        val textCard = findViewById<TextView>(R.id.purchase_confirmation_text)
        textCard.text = "Confirmación\nCompra exitosa"
    }
}