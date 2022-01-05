package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Double.*;
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            var so1 : Double= parseDouble(textView3.text.toString())
            var so2 : Double= parseDouble(textView4.text.toString())
            var tong :Double = so1+so2
            textView6.text=tong.toString()
        }
    }


}