package com.example.activityassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // Get the ImageView and TextView from the layout
        val imageView = findViewById<ImageView>(R.id.displayImageView)
        val textView = findViewById<TextView>(R.id.nameTextView)

        val closeButton = findViewById<Button>(R.id.closeButton)

        // Get the image data from the intent extras
        val imageId = intent.getIntExtra("imageId", 0)
        val imageName = intent.getStringExtra("imageName")

        // Set the image and text in the layout
        imageView.setImageResource(imageId)
        textView.text = imageName

        val intent = Intent(this, SelectionActivity::class.java)

        // Brings you back to SelectionActivity
        closeButton.setOnClickListener {
            startActivity(intent)
        }
    }
}