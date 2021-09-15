package com.anlian.loginandregister

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anlian.loginandregister.databinding.ActivityWelcomePageBinding

class WelcomePage : AppCompatActivity() {
    private lateinit var binding : ActivityWelcomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomePageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.registerBtn.setOnClickListener { moveToRegisterPage() }
    }

    fun moveToRegisterPage() {
        val intent = Intent(this, RegisterPage::class.java)
        startActivity(intent)
    }
}