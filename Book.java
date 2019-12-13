package com.semanticsquare.thrillio.entities;

public class Book extends Bookmark {
	private int publicationYear;
	private String publisher;
	private String[] authors;
	private String genre;
	private double amazonRating;

	protected int getPublicationYear() {
		return publicationYear;
	}

	protected void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	protected String getPublisher() {
		return publisher;
	}

	protected void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	protected String[] getAuthors() {
		return authors;
	}

	protected void setAuthors(String[] authors) {
		this.authors = authors;
	}

	protected String getGenre() {
		return genre;
	}

	protected void setGenre(String genre) {
		this.genre = genre;
	}

	protected double getAmazonRating() {
		return amazonRating;
	}

	protected void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}
//This is a one line comment added for testing purposes.
}
