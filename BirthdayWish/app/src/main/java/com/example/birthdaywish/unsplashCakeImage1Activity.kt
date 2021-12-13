package com.example.birthdaywish

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.TestLooperManager
import android.widget.TextView

class unsplashCakeImage1Activity : AppCompatActivity() {


//    lateinit var music:MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_unsplash_cake_image1)

        val music: MediaPlayer = MediaPlayer.create(this, R.raw.happybirthday4)
        val namess2 = intent.getStringExtra("name_extra")
        val input:TextView = findViewById(R.id.textView2)
        "Happy Birthday\n $namess2".also { input.text = it }
        //music.start()
    }


//    override fun onDestroy() {
//
//
//        super.onDestroy()
//        if(music!=null){
//            music.stop()
//            music.reset()
//            music.release()
//        }
//    }

//    override fun onBackPressed() {
//        super.onBackPressed()
//        finish()
//    }
}