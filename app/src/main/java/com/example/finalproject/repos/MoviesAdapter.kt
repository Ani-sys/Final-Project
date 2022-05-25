package com.example.finalproject.repos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.LayoutMovieItemBinding
import com.example.finalproject.responseModels.MovieItem

class MoviesAdapter(val movieList:MutableList<MovieItem>):RecyclerView.Adapter<MoviesViewHolder>() {
    private lateinit var  itemClickListener:(MovieItem,Int) -> Unit

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding = LayoutMovieItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MoviesViewHolder(binding)
    }

    fun setOnItemClickListener(itemClickListener: (MovieItem, Int) -> Unit)
    {
        this.itemClickListener = itemClickListener
    }

    fun newList(movies:List<MovieItem>)
    {
        movieList.clear()
        movieList.addAll(movies)
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val movie = movieList[position]


        holder.binding.tvMovieName.text = movie.originalTitle
        holder.binding.tvRateNumber.text = movie.voteAverage.toString()
        holder.binding.tvReleaseDate.text = movie.releaseDate
        holder.binding.tvMovieName.setOnClickListener {
            itemClickListener.invoke(movie,position)
        }

//        val rating = holder.itemView.findViewById<Double>(R.id.tvRating)
//        rating. = movie.rating

    }

    override fun getItemCount(): Int {
      return movieList.size
    }


}

data class Movie(
    val movieName:String,
    val picture:String,
    val isChecked:Boolean,
    val rating:Double,

)

class MoviesViewHolder(val binding:LayoutMovieItemBinding):RecyclerView.ViewHolder(binding.root){

}

