package com.example.recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    private lateinit var rv: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        rv = findViewById(R.id.rv)
        val al = intent.extras?.getStringArrayList("key")

        rv.adapter = al?.let { MyAdap(this, it) }
        rv.layoutManager = LinearLayoutManager(this)


    }
}