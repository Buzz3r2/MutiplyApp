package com.example.multiplyapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var num1 = findViewById<EditText>(R.id.edtNum1)
    var num2 = findViewById<EditText>(R.id.edtNum2)
    var btnCalc = findViewById<Button>(R.id.btnCalc)
    var txtResult = findViewById<TextView>(R.id.txtAns)
    // assigned variables

    fun Multiply(num1, num2){

        var result : Int = num1 * num2



    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            btnCalc.setOnClickListener {
                Multiply(num1, num2) // <- calling function
            }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}