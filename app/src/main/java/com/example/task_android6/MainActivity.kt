package com.example.task_android6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et_word = findViewById<EditText>(R.id.et_word)
        val tv_word = findViewById<TextView>(R.id.tv_word)
        val check = findViewById<Button>(R.id.btn_check)
        val show = findViewById<Button>(R.id.btn_show)
        val wrong_word: String = "putcomer "

        tv_word.text = wrong_word

        check.setOnClickListener {
            val word = et_word.editableText.toString()
            val congrats: String = "Congratulations"
            val try_again: String = "Try again!!"
            val true_word: String = "computer"

            if (word == true_word){
                tv_word.text = congrats
            }
            else {
                tv_word.text = try_again
            }
        }

        show.setOnClickListener {
            val true_word: String = "computer"
            tv_word.text = true_word
        }


    }
}