package com.example.birthdaywish

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class PlacementWishingActivity : AppCompatActivity() {

    //lateinit var music:MediaPlayer
    //var  music: MediaPlayer = MediaPlayer.create(this, R.raw.happybirthday4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placement_wishing)


        val input1:TextView = findViewById(R.id.textView4)
        val input2:TextView = findViewById(R.id.textView5)

        val names = intent.getStringExtra("name_extra")
        val collegenames = intent.getStringExtra("college_name_extra")


        input1.text="Congratulations \n$names"
        input2.text="On Graduating From\n$collegenames"
    }

    override fun onDestroy() {

        super.onDestroy()
        //music.start()
       // music.pause()
        Log.d("GRAD_GREET_ACTIVITY", "onDestroy: gDAY")
    }

}


