package com.example.espressounittests

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.espressounittests.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.detailsTvId.text = intent.getStringExtra("KEY")
    }
}