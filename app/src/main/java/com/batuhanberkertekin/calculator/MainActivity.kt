package com.batuhanberkertekin.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        toplamaButton.setOnClickListener {

            val number = editText.text.toString().toIntOrNull()
            val number2 = editText2.text.toString().toIntOrNull()
            if( number != null && number2 !=null){
                val result = (number + number2)

                textView.text = "Result : $result"

            }else{
                textView.text = "Lütfen sayi giriniz"
            }





        }
        cikarmaButton.setOnClickListener {

            val number = editText.text.toString().toIntOrNull()
            val number2 = editText2.text.toString().toIntOrNull()
            if( number != null && number2 !=null){
                val result = (number - number2)

                textView.text = "Result : $result"

            }else{
                textView.text = "Lütfen sayi giriniz"
            }
        }

        carpmaButton.setOnClickListener {
            val number = editText.text.toString().toIntOrNull()
            val number2 = editText2.text.toString().toIntOrNull()
            if( number != null && number2 !=null){
                val result = (number * number2)

                textView.text = "Result : $result"

            }else{
                textView.text = "Lütfen sayi giriniz"
            }

            bolmeButton.setOnClickListener {
                val number = editText.text.toString().toIntOrNull()
                val number2 = editText2.text.toString().toIntOrNull()
                if( number != null && number2 !=null){
                    val result = (number / number2)

                    textView.text = "Result : $result"

                }else{
                    textView.text = "Lütfen sayi giriniz"
                }
            }
            clearButton.setOnClickListener {


                textView.text = ""


            }
        }




    }
}