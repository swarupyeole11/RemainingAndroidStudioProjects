package com.example.birthdaywish

import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.provider.MediaStore
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import java.io.ByteArrayOutputStream


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }




    fun wishGraduationButtonclick(view: View) {

        val input:EditText = findViewById(R.id.nameInput)
        val name1 = input.editableText.toString()

        val input2:EditText=findViewById(R.id.collegeName)
        val collegename = input2.editableText.toString()


        ///////////////////////////////////////////////////////
        //TRYING TO EXTRACT THE LOADED IMAGE
        // val inputImage:ImageView = findViewById(R.id.imageToBeLoadedIdMain_xml)
        // val image = inputImage.imageAlpha
        //////////////////////////////////////////////////////

        val intent = Intent(this , PlacementWishingActivity::class.java)  //we have named variable as intent it can be anything
        intent.putExtra("name_extra",name1)
        intent.putExtra("college_name_extra",collegename)


        ///////////////////////////////////////////////////////
        //TRYING TO PASS THE LOADED IMAGE IN OTHER ACTIVITY
        //intent.putExtra("image",image)
        //////////////////////////////////////////////////////

        startActivity(intent)
    }

    fun wishBirthdayButtonClick(view: android.view.View)
    {
        // input  VARIABLE ACTS AS THE REFERENCE TO THE TEXT INPUT BY USER IN THE EDIT_TEXT PRESENT IN activity_main.xml
        // name VARIABLE GETS and STORES THE TEXT INPUT ENTERED BY USER
        val input:EditText = findViewById(R.id.nameInput)
        val name = input.editableText.toString()


        val intents = Intent(this , BirthdayGreetingActivity::class.java)  //we have named variable as intents but it can be anything
        intents.putExtra("name_extra",name) //FOR PASSING ENTERED STRING FROM THIS  BirthdayGreetingActivity

        startActivity(intents)//FOR STARTING THE INTENT
    }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
//    {
//        val pickImage = 100
//        var imageUri: Uri?
//        val imageView: ImageView = findViewById(R.id.imageToBeLoadedIdMain_xml)
//        super.onActivityResult(requestCode, resultCode, data)
//        if (resultCode == RESULT_OK && requestCode == pickImage) {
//            imageUri = data?.data
//            imageView.setImageURI(imageUri)
//        }
//    }

//    fun onClickingLoadImageInMainActivity(view: android.view.View) {
//        val pickImage = 100
//        val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI)
//        startActivityForResult(gallery,pickImage)
//    }

}