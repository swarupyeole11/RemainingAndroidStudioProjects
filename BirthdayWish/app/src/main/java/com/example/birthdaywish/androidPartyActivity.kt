package com.example.birthdaywish

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import android.content.Intent
import android.net.Uri
import android.provider.MediaStore
import android.widget.ImageView


class androidPartyActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android_party)

        val namess1 = intent.getStringExtra("name_extra")
        val input:TextView = findViewById(R.id.textView2)
        input.text="Happy Birthday\n\n$namess1"
        // happyBirthdayMusic1()
         //onDestroy()

    }

    private fun happyBirthdayMusic1(){
        val music: MediaPlayer = MediaPlayer.create(this, R.raw.happybirthday3)
        music.start()
    }

//    override fun onDestroy() {
//
//        super.onDestroy()
//        music.stop()
//        music.reset()
//        music.release()
//    }

}

