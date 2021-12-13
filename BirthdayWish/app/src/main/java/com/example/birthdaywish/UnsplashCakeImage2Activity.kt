package com.example.birthdaywish

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class UnsplashCakeImage2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_unsplash_cake_image2)

        val namess3 = intent.getStringExtra("name_extra")
        val input:TextView = findViewById(R.id.textView3)
        input.text="Happy Birthday \n$namess3"
        //happyBirthdayMusic3()
    }


    private fun happyBirthdayMusic3(){
        val music: MediaPlayer = MediaPlayer.create(this, R.raw.happybirthday1)
        music.start()
    }
}
