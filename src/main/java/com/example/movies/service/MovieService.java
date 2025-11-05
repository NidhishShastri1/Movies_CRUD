package com.example.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

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
}
