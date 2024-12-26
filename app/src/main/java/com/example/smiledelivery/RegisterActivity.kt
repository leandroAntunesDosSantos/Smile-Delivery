package com.example.smiledelivery

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.smiledelivery.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity()  {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)

        binding.buttonDelivery.setOnClickListener {}
        setContentView(binding.root)
    }
}
