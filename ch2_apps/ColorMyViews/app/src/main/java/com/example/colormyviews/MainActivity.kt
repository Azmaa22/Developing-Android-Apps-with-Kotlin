package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var boxThree:View
    lateinit var boxFour:View
    lateinit var boxFive:View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }


     private fun setListeners() {
         boxThree=findViewById(R.id.box_three_text)
         boxFour=findViewById(R.id.box_four_text)
         boxFive=findViewById(R.id.box_five_text)

         val clickableViews: List<View> =
             listOf(findViewById(R.id.box_one_text), findViewById(R.id.box_two_text),
                 findViewById(R.id.box_three_text),
                 findViewById(R.id.box_four_text), findViewById(R.id.box_five_text),
                 findViewById(R.id.body_layout),
                 findViewById(R.id.red_btn),findViewById(R.id.yellow_btn),findViewById(R.id.green_btn),
                 )

         for (item in clickableViews) {
             item.setOnClickListener { makeColored(it) }
         }
     }
     private fun makeColored(view: View) {
         when (view.id) {

             // Boxes using Color class colors for background
             R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
             R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

             // Boxes using Android color resources for background
             R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_blue_bright)
             R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_orange_dark)
             R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_purple)
             // Boxes using custom colors for background
             R.id.red_btn ->boxThree.setBackgroundResource(R.color.red)
             R.id.yellow_btn -> boxFour.setBackgroundResource(R.color.yellow)
             R.id.green_btn -> boxFive.setBackgroundResource(R.color.green)
             else -> view.setBackgroundColor(Color.LTGRAY)
         }
     }

}