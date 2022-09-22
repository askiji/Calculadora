package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var  btnS : ImageButton
        btnS = findViewById(R.id.suma)

        btnS.setOnClickListener(){
            btnS.setImageResource(R.drawable.sumaa)
        }
                var  btnR : ImageButton
        btnR= findViewById(R.id.resta)

        btnR.setOnClickListener(){
            btnR.setImageResource(R.drawable.restaa)
        }
                var  btnM : ImageButton
        btnM = findViewById(R.id.multi)

        btnM.setOnClickListener(){
            btnM.setImageResource(R.drawable.multia)
        }
                var  btnD : ImageButton
        btnD = findViewById(R.id.divi)

        btnD.setOnClickListener(){
            btnD.setImageResource(R.drawable.divia)
        }


    }
}