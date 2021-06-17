package com.movies.api.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Movies {
	@JsonProperty("movies")
	private List<Movie> movies;
}
