package com.example.finalproject.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.finalproject.entities.MovieModel

@Dao
interface MoviesDao {
    @Query("SELECT * FROM MOVIES_WATCHLIST")
    fun getAll():List<MovieModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovie(movieModel: MovieModel)
}