package com.anlian.loginandregister

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.anlian.loginandregister.databinding.ActivityRegisterPageBinding

class RegisterPage : AppCompatActivity() {
    private lateinit var binding : ActivityRegisterPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterPageBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //indikator tombol register ditekan
        binding.registerBtnConfirm.setOnClickListener {
            Toast.makeText(
                this,
                getString(R.string.register_success),
                Toast.LENGTH_LONG).show()
        }
        //pindah ke login page
        binding.signInBtn.setOnClickListener{
            moveToLoginPage()
        }

    }

    fun moveToLoginPage() {
        val intent = Intent(this,LoginPage::class.java)
        startActivity(intent)
    }
}