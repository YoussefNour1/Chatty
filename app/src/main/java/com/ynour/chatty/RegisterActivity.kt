package com.ynour.chatty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    private lateinit var editTextUsername: EditText
    private lateinit var editTextEmail: EditText
    private lateinit var editTextPassword1: EditText
    private lateinit var editTextPassword2: EditText
    private lateinit var btn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        editTextUsername = findViewById(R.id.editUsername2)
        editTextEmail = findViewById(R.id.editTextTextEmailAddress)
        editTextPassword1 = findViewById(R.id.editTextTextPassword)
        editTextPassword2 = findViewById(R.id.editTextTextPassword2)
        btn = findViewById(R.id.button2)
        val username = editTextUsername.text
        val email = editTextEmail.text
        val password1 = editTextPassword1.text
        val password2 = editTextPassword2.text

        btn.setOnClickListener{
            if ( username.isNotEmpty() && email.isNotEmpty() && password1.isNotEmpty() && password2.isNotEmpty() ){
                if (password1.toString() == password2.toString()){
                    val intent = Intent(this, SecondActivity::class.java).apply {
                        putExtra(EXTRA_MESSAGE, editTextUsername.text.toString())
                    }
                    Toast.makeText(this, "Signed up successfully", Toast.LENGTH_SHORT).show()
                    startActivity(intent)
                }
                else{
                    Toast.makeText(this, "Passwords didn't match", Toast.LENGTH_SHORT).show()
                }
            }
            else{
                Toast.makeText(this, "Please fill the required fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}