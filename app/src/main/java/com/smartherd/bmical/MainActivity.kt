package com.smartherd.bmical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv4.visibility=View.INVISIBLE
       btn.setOnClickListener {
           var h:Double = ed1.text.toString().toDouble()
           var w:Double = ed2.text.toString().toDouble();
           var bmi:Double=w/(h*h)
           var cat:String=""
           if(bmi<18.5)
                          {cat="Underweight"}
           else if((bmi>=18.5)&&(bmi<=24.9))
           {
              cat= "Normal"
           }
           else
           {
              cat= "Overweight"
           }
           tv4.text="Your BMI is ${String.format("%.2f",bmi)} and you are ${cat}"
           tv4.visibility=View.VISIBLE
       }
    }
}