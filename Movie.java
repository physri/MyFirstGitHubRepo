package com.semanticsquare.thrillio.entities;

public class Movie extends Bookmark {
	private int releaseYear;
	private String[] cast;
	private String[] directors;
	private String genre;
	private double imdbRating;

	protected int getReleaseYear() {
		return releaseYear;
	}

	protected void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	protected String[] getCast() {
		return cast;
	}

	protected void setCast(String[] cast) {
		this.cast = cast;
	}

	protected String[] getDirectors() {
		return directors;
	}

	protected void setDirectors(String[] directors) {
		this.directors = directors;
	}

	protected String getGenre() {
		return genre;
	}

	protected void setGenre(String genre) {
		this.genre = genre;
	}

	protected double getImdbRating() {
		return imdbRating;
	}

	protected void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

}
