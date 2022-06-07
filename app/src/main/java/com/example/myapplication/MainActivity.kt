package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.title = "Home activity"

        val textBox = findViewById<EditText>(R.id.txtName)
        val enterButton = findViewById<Button>(R.id.btnEnter)
        val display = findViewById<TextView>(R.id.lblDisplay)

        enterButton.setOnClickListener {
            display.text = textBox.text
        }

        val nextButton = findViewById<Button>(R.id.btnNext)

        nextButton.setOnClickListener {
            val intent = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
        }
    }

}