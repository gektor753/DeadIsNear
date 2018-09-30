package com.`var`.deadisnear

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    val playButton: Button = findViewById(R.id.playButton)
    val exitButton: Button = findViewById(R.id.exitButton)
    val settingsButton: Button = findViewById(R.id.settingsButton)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton.setOnClickListener {
            // TODO
            print("Play")
        }

        exitButton.setOnClickListener {
            // TODO
            print("Exit")
        }

        settingsButton.setOnClickListener {
            // TODO
            print("Open settings")
        }
    }
}
