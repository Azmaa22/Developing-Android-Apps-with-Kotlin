package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class DiceRollerActivity : AppCompatActivity() {
    private  lateinit var rollerImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)
        val rollerButton:Button = findViewById(R.id.roll_button)
        rollerImage = findViewById(R.id.roll_result)
        rollerButton.setOnClickListener{
          //  Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
rollDice()
        }
    }

    private fun rollDice() {
        val drawableCurrentImg = when(Random.nextInt(1,7)){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        rollerImage.setImageResource(drawableCurrentImg)

    }
}