package com.daelim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    private lateinit var idInput: EditText
    private lateinit var pwInput: EditText
    private lateinit var loginButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        idInput = findViewById(R.id.idInput)
        pwInput = findViewById(R.id.pwInput)
        loginButton = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            login()
        }
    }

    private fun login() {
        val id = idInput.text.toString()
        val pw = pwInput.text.toString()
        if (pw == "1234") {
            val intent = Intent(this, MainActivity::class.java).apply {
                putExtra("userId", id)
            }
            startActivity(intent)
        } else {
            Log.d("loginactivity", "1234입력")
        }
    }
}