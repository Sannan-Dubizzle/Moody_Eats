package com.example.moodyeats

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.moodyeats.R
import com.example.moodyeats.Constants

class ResultActivity : AppCompatActivity() {
lateinit var btn_finish:Button
lateinit var iv_trophy:ImageView
lateinit var finalmessage:TextView
lateinit var result:TextView
lateinit var ingridients:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // TODO (STEP 6: Hide the status bar and get the details from intent and set it to the UI. And also add a click event to the finish button.)
        // START
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        ingridients.findViewById<TextView>(R.id.resultingridients)
        iv_trophy=findViewById(R.id.iv_trophy)
        finalmessage=findViewById(R.id.tv_final_msg)

        result=findViewById(R.id.tv_result)
        btn_finish=findViewById(R.id.btn_finish)
        val score = intent.getIntExtra(Constants.CORRECT_ANSWERS_SCORE, 0)

     //   tv_score.text = "Your Score is $correctAnswers out of $totalQuestions."
        if(score%4==0)
            iv_trophy.setImageResource(R.drawable.dessert)
        else if (score%4==1)
            iv_trophy.setImageResource(R.drawable.sushi)
        else if (score%4==2)
            iv_trophy.setImageResource(R.drawable.sea_food)
        else
            iv_trophy.setImageResource(R.drawable.red_meat)

        // Get back To Home Page
        btn_finish.setOnClickListener {
           finish()
        }
        ingridients.setOnClickListener {
            //go to ingridients page
        }
        // END
    }
}