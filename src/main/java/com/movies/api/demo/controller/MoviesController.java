package com.movies.api.demo.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.movies.api.demo.dto.Movies;

@RestController
public class MoviesController {
	
	@GetMapping(value = "/movies")
    public Movies getMovies() {
        return readFromJsonFile();
    }

	private Movies readFromJsonFile() {
		ObjectMapper mapper = new ObjectMapper();
		Movies movies = null;
		try {
			movies = mapper.readValue(new File("src\\main\\resources\\movies.json"), Movies.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return movies;
	}
}
