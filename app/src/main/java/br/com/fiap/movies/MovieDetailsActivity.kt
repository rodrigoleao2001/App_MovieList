package br.com.fiap.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.movies.databinding.ActivityMovieDetailsBinding

class MovieDetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMovieDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMovieDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val sinopsis = intent.getStringExtra("sinopsis")
        val parentalRating = intent.getStringExtra("parentalRating")
        val genre = intent.getStringExtra("genre")
        val duration = intent.getStringExtra("duration")
        val inTheaters = intent.getBooleanExtra("inTheaters", false)

        binding.tvMovieName.text = name
        binding.tvSinopsis.text = sinopsis
        binding.tvParentalRating.text = parentalRating
        binding.tvGenre.text = genre
        binding.tvDuration.text = duration
        binding.tvInTheaters.text = if (inTheaters) "Em Cartaz" else "Fora de Cartaz"
    }
}
