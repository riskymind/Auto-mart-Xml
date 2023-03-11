package com.asterisk.automart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asterisk.automart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var biniding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biniding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biniding.root)

        biniding.apply {
            bottomNavigationView.apply {
                background = null
                menu.getItem(1).isEnabled = false
            }
        }
    }
}