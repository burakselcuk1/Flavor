package com.base.flavor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeText = findViewById<TextView>(R.id.text)

        val flavor = BuildConfig.FLAVOR

        val welcomeMessage = when (flavor) {
            "admin" -> R.string.welcome_message_admin
            "customer" -> R.string.welcome_message_customer
            else -> R.string.welcome_message_default // Varsayılan metin
        }

        welcomeText.text = getString(welcomeMessage)


    }
}