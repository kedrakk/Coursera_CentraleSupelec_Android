package com.example.block_01

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val invisibleButton= findViewById<Button>(R.id.button_blue_invisible)
        invisibleButton.setOnClickListener {
            invisibleButton.visibility=View.INVISIBLE
        }

        val pinkButton:Button=findViewById(R.id.button_two)
        pinkButton.setOnClickListener {
            Toast.makeText(applicationContext,"to do to do to do ....",Toast.LENGTH_SHORT).show()
        }
    }
}