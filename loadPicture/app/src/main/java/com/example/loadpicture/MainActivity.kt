package com.example.loadpicture

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {


    // SEE CAREFULLY HOW THE VARIABLES ARE DEFINED INSIDE CLASS BUT OUTSIDE FUNCTION TO BE AVIALABLE TO ALL FUNCTIONS INSIDE THE CLASS
    private val pickImage = 100
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onClickingLoadImageButtonInMainActivity(view: android.view.View)
    {

        val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
        startActivityForResult(gallery, pickImage)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        val imageView :ImageView = findViewById(R.id.imageView)
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
            imageView.setImageURI(imageUri)
        }
    }

    fun onClickingLoadedImageInMainActivity(view: android.view.View) {

        val intent = Intent(this,SecondaryActivity::class.java)
        startActivity(intent)
    }


}