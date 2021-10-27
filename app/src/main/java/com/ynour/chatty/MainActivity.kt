package com.ynour.chatty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
const val EXTRA_MESSAGE = "com.ynour.chatty";
class MainActivity : AppCompatActivity() {
    private lateinit var editText: EditText
    private lateinit var editPassword: EditText
    private lateinit var btn:Button
    private lateinit var btn2:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editUserName)
        editPassword = findViewById(R.id.editPassword)
        val username = editText.text
        val password = editPassword.text
        btn = findViewById(R.id.button)
        btn.setOnClickListener{
            if (username.isNotEmpty() && password.isNotEmpty()){

                val intent = Intent(this, SecondActivity::class.java).apply {
                    putExtra(EXTRA_MESSAGE, username.toString())
                }
                startActivity(intent)
                finish()
            }
        }
        btn2 = findViewById(R.id.button2)
        btn2.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}