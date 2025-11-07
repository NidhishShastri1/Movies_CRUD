package com.example.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.movies.model.Movies;
import com.example.movies.service.MovieService;

@Controller
public class MoviesController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/")
	public String loadHome() {
		return "home";
	}
	
	@GetMapping("/add")
	public String loadInsert() {
		return "insert";
	}
	
	@PostMapping("/add")
	public String insertMovies(@ModelAttribute Movies movies, ModelMap modelMap) {
		movieService.insertMovies(movies);
		modelMap.put("message", "Movie added successfully");
		return "home";
	}

	
	@GetMapping("/view")
	public String viewMovie(ModelMap modelMap) {
		modelMap.put("movies",movieService.viewMovie());
		return "fetch";
	}
	@GetMapping("/delete")
	public String deleteMovie(@RequestParam int id,ModelMap modelMap) {
		movieService.deleteMovie(id);
		modelMap.put("movies", movieService.viewMovie());
		return "fetch";
	}
	@GetMapping("/update")
	public String updateForm(@RequestParam int id,ModelMap modelMap) {
		
		modelMap.put("movies", movieService.findById(id));
		return "update";
	}
	@PostMapping("/update")
	public String updateForm(@ModelAttribute Movies movies,ModelMap modelMap) {
		movieService.insertMovies(movies);
		modelMap.put("message","Data Updated" );
		return viewMovie(modelMap);
	}

}
