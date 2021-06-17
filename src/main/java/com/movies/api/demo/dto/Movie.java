package com.movies.api.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Movie {
	@JsonProperty("Language")
	private String language;
	
	@JsonProperty("Location")
	private String location;
	
	@JsonProperty("Plot")
	private String plot;
	
	@JsonProperty("Poster")
	private String poster;
	
	@JsonProperty("SoundEffects")
	private String[] soundEffect;
	
	@JsonProperty("Stills")
	private String[] stills;
	
	@JsonProperty("Title")
	private String title;
	
	@JsonProperty("imdbID")
	private String imdbId;
	
	@JsonProperty("listingType")
	private String listingType;
	
	@JsonProperty("imdbRating")
	private String imbdbRating;
}
