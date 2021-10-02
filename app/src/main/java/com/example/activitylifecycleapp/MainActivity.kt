package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity","on start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity","on resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity","on pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity","on stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity","on destroy")
    }
}