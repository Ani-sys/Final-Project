package com.example.finalproject.Activites

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.databinding.ActivitySecondBinding

class SecondActivity:AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            if (binding.etUsername.text.isBlank() || binding.etPassword.text.isBlank())
            {
                val toast = Toast.makeText(this, "Username or Password is incorrect", Toast.LENGTH_LONG)
                toast.show()
            }
            else
            {
                val intent = Intent(this, ThirdActivity::class.java)
                startActivity(intent)
            }
        }

        binding.tvSkipLogin.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}