package com.example.birthdaywish

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView

class BirthdayGreetingActivity : AppCompatActivity() {

//    companion object {
//        const val Name_Extra = " "
//    }
//  private var policeSound: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

    }


    fun androidPartyImageClick(view: android.view.View)
    {
        val names1 = intent.getStringExtra("name_extra")
        val intent = Intent(this,androidPartyActivity::class.java)
        intent.putExtra("name_extra",names1)
        //happyBirthdayMusic1()
        startActivity(intent)
    }



    fun unsplashbirthdaycake2ImageClick(view: android.view.View)
    {
        val names2: String? = intent.getStringExtra("name_extra")
        val intent = Intent(this,UnsplashCakeImage2Activity::class.java)
        intent.putExtra("name_extra",names2)
        startActivity(intent)
    }

    fun unsplashbirthdaycake1ImageClick(view: android.view.View)
    {
        val names3: String? = intent.getStringExtra("name_extra")
        val intent = Intent(this,unsplashCakeImage1Activity::class.java)
        intent.putExtra("name_extra",names3)
        startActivity(intent)
    }

    override fun onPause() {
        super.onPause()
        Log.d("BIRTHDAY_GREET_ACTIVITY", "onPause: BDAY")

    }

    override fun onResume() {
        super.onResume()
        Log.d("BIRTHDAY_GREET_ACTIVITY", "onResume: BDAY")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BIRTHDAY_GREET_ACTIVITY", "onDestroy: BDAY")
    }

}


