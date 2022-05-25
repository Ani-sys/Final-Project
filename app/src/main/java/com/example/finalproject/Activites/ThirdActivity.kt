package com.example.finalproject.Activites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.finalproject.R
import com.example.finalproject.databinding.ActivityThirdBinding
import com.example.finalproject.listScreen.MovieListFragment

class ThirdActivity:AppCompatActivity() {
    private lateinit var binding:ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityThirdBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tvTopRated.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flContent,MovieListFragment())
                addToBackStack(MovieListFragment::javaClass.name)
                commit()
            }
        }
    }
}