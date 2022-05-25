package com.example.finalproject.listScreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.finalproject.API.API
import com.example.finalproject.R
import com.example.finalproject.databinding.FragmentMovieListBinding
import com.example.finalproject.detailsScreen.MovieDetailsFragment
import com.example.finalproject.repos.Movie
import com.example.finalproject.repos.MoviesAdapter
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class MovieListFragment:Fragment() {
    private var _binding:FragmentMovieListBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    _binding = FragmentMovieListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
         super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
        val api = Retrofit.Builder().baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(API::class.java)

        CoroutineScope(IO).launch {
           // val response = API.loginWithUserName("")
            withContext(Main){
            }
        }


    }
    private fun setUpRecyclerView()
    {
        binding.rvMovies.layoutManager = LinearLayoutManager(requireContext(),
            LinearLayoutManager.VERTICAL,false)
        binding.rvMovies.adapter = MoviesAdapter(
            mutableListOf()
        )
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}