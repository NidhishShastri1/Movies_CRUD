package com.example.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.movies.model.Movies;
import com.example.movies.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movieRepository;
	
	public void insertMovies( Movies movies ) {
		movieRepository.save(movies);
		
	}
	
	public List<Movies> viewMovie() {
		return movieRepository.findAll();
	}
	public void deleteMovie(int id) {
		movieRepository.deleteById(id);
	}
	public Movies findById(int id) {
		Optional<Movies> movie=movieRepository.findById(id);
		return movie.get();
	}
}
