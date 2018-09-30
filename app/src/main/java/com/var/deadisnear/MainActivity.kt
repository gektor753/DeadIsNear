package com.`var`.deadisnear

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var playButton: Button
    lateinit var exitButton: Button
    lateinit var settingsButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playButton = findViewById(R.id.playButton);
        exitButton = findViewById(R.id.exitButton);
        settingsButton = findViewById(R.id.settingsButton);

        playButton.setOnClickListener {
            // TODO
            Log.d("PlayButton", "clicked")
        }

        exitButton.setOnClickListener {
            // TODO
            Log.d("ExitButton", "clicked")
        }

        settingsButton.setOnClickListener {
            // TODO
            Log.d("SettingsButton", "clicked")
        }
    }
}
