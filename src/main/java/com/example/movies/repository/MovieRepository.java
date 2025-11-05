package com.example.movies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movies.model.Movies;

public interface MovieRepository extends JpaRepository<Movies, Integer>{

}
