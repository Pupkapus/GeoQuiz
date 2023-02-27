package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

private lateinit var true_button:Button
private lateinit var false_button:Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        true_button = findViewById(R.id.true_button)
        false_button = findViewById(R.id.false_button)

        true_button.setOnClickListener{
            val toast = Toast.makeText(this, R.string.correct, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
        }

        false_button.setOnClickListener{
            val message2 = Toast.makeText(this, R.string.incorrect, Toast.LENGTH_SHORT);
            message2.setGravity(Gravity.TOP, 0, 0);
            message2.show();
        }
    }
}