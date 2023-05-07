package com.inal.movieku_kt.listeners

import com.inal.movieku_kt.models.Movies

interface OnMovieClickListener {
    fun onMoveClick(movies: Movies, genres: String)
}