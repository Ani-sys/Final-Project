package com.example.finalproject.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movies_watchlist")
data class MovieModel(
     @PrimaryKey(autoGenerate = true)
     val id:Int,
     val movieName:String,
     val rating:Int,
     val releaseDate:Int
)
