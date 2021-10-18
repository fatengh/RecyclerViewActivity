package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var ed1: EditText
    private lateinit var ed2: EditText
    private lateinit var ed3: EditText
    private lateinit var ed4: EditText

    private lateinit var btnsend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed1 = findViewById(R.id.ed1)
        ed2 = findViewById(R.id.ed2)
        ed3 = findViewById(R.id.ed3)
        ed4 = findViewById(R.id.ed4)

        btnsend = findViewById(R.id.btnsend)

        btnsend.setOnClickListener {
            startActivity(
                Intent(this, MainActivity2::class.java).putExtra(
                    "key", arrayListOf(
                        ed1.text.toString(),
                        ed2.text.toString(),
                        ed3.text.toString(),
                        ed4.text.toString()
                    )
                )
            )
        }
    }
}