package com.example.myrateyashi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val simpleRatingBar:RatingBar=findViewById(R.id.ratingBar)

        val submitButton:Button=findViewById(R.id.button2)
        submitButton.setOnClickListener{
            val totalStars="Total Stars:: "+ simpleRatingBar.numStars
            val rating="Rating:: "+ simpleRatingBar.rating
            if(simpleRatingBar.rating <= 2)
            Toast.makeText(this,"""your rating is $rating. Better luck next time  """.trimIndent(),Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,"""your rating is $rating .Good work """.trimIndent(),Toast.LENGTH_LONG).show();
        }

    }
}