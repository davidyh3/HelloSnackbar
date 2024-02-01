package com.example.hellosnackbar

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button
        val btn = findViewById<Button>(R.id.sayHelloButton) as Button

        // Set button behavior
        btn.setOnClickListener { v: View? -> updateText() }
    }

    private fun updateText() {
        // Write log about button click action
        Log.i("HelloSnackbarApp", "Button Clicked!")

        // Find the root view of your layout
        val rootView = findViewById<View>(R.id.content)

        // Create a Snackbar instead of Toast
        Snackbar.make(rootView, "Clicked!", Snackbar.LENGTH_SHORT).show()

        // Find the TextView
        val helloSnackbar = findViewById<TextView>(R.id.helloWorld)

        // Print "Hello Snackbar!"
        helloSnackbar.text = "Hello Snackbar!"
    }

}