package com.example.espressounittests

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.espressounittests.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var msg: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewInit()
    }

    private fun viewInit() {

        binding.subBtnId.setOnClickListener {
            msg = "Title - ${binding.titleEtvId.text} | Description - ${binding.decEtvId.text}"
            val intent = Intent(this, DetailsActivity::class.java)
            intent.putExtra("KEY", msg)
            startActivity(intent)
        }


    }
}