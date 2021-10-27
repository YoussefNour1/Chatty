package com.ynour.chatty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name = intent.getStringExtra(EXTRA_MESSAGE)
        val textView= findViewById<TextView>(R.id.textView7).apply {
            text = name
        }
    }
}