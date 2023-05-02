package br.com.fiap.movies;
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.fiap.movies.MovieDetailsActivity
import br.com.fiap.movies.adapter.MoviesAdapter
import br.com.fiap.movies.databinding.ActivityMainBinding
import br.com.fiap.movies.repository.MovieRepository

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movies = MovieRepository.movieList
        val adapter = MoviesAdapter(movies) { movie ->
            val intent = Intent(this, MovieDetailsActivity::class.java)
            intent.putExtra("name", movie.name)
            intent.putExtra("sinopsis", movie.sinopsis)
            intent.putExtra("parentalRating", movie.parentalRating)
            intent.putExtra("genre", movie.genre)
            intent.putExtra("duration", movie.duration)
            intent.putExtra("inTheaters", movie.inTheaters)
            startActivity(intent)
        }

        binding.rvMovies.layoutManager = LinearLayoutManager(this)
        binding.rvMovies.adapter = adapter
    }
}
