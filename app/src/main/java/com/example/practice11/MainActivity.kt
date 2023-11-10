package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(view: View) {
        val b1: Button = findViewById(R.id.button)
        val photo: ImageView = findViewById(R.id.imageView3)
        val image : Int = R.drawable.pear
        if (b1.isClickable){
            photo.setImageResource(image)

        }
    }

    fun OnClickImage(view: View) {
        val b2 :ImageButton = findViewById(R.id.imageButton)
        val photo: ImageButton = findViewById(R.id.imageButton)
        val image : Int = R.drawable.star
        if (b2.isClickable){
            photo.setImageResource(image)
        }
    }
}