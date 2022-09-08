package com.example.block_06

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val largeImageView:ImageView=findViewById(R.id.image_large)
        largeImageView.setImageResource(R.drawable.drawing)

        val smallImage:ImageView=findViewById(R.id.small_image)
        smallImage.setImageResource(R.drawable.drawing)

        val seekBar:SeekBar=findViewById(R.id.seekbar_id)
        seekBar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            var lastProgress:Int = 0
            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                lastProgress=p1
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                largeImageView.setColorFilter(Color.argb(255,0,lastProgress,255-lastProgress))
            }
        })
    }
}
