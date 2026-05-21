package com.example.multiplyapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val edtNum1
    val edtNum2
    val multiplyButton = findViewById<Button>(R.id.btnCalc)
    val txtResult
    num1 = edtNum1.text // fix this
    num2 = edtNum2.text
    btnCalc = btnCalc
    ans = txtResult.text

    fun Multiply(){


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        onButton click {
            Multiply() // <- calling function
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}