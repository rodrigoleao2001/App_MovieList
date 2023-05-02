package br.com.fiap.movies.model

data class Movie(
    val name: String,
    val sinopsis: String,
    val parentalRating: String,
    val genre: String,
    val duration: String,
    val inTheaters: Boolean
)
