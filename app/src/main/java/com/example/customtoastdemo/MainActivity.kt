package com.example.customtoastdemo

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.bottomappbar.BottomAppBar

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val logIn = findViewById<Button>(R.id.btnLogin)

        logIn.setOnClickListener {
            showToast()

            val mediaPlayer: MediaPlayer = MediaPlayer.create(this, R.raw.tryagain)
            mediaPlayer.start()
    }
  }

    private fun showToast() {
        val inflater: LayoutInflater = layoutInflater
        val view: View = inflater.inflate(R.layout.customtoast_layout, findViewById(R.id.customtoast_id))
        val toast: Toast = Toast(this)
        toast.setGravity(Gravity.BOTTOM or Gravity.FILL_HORIZONTAL, 0,0)
        toast.duration = Toast.LENGTH_SHORT
        toast.view = view
        toast.show()
    }
}

