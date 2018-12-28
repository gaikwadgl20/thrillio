package com.semanticsquare.thrillio.entities;

import java.util.Arrays;

public class Movie extends Bookmark {
	private int releaseYear;
	private String[] cast;
	private String[] director;
	private String generics;
	private double imdbRating;

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String[] getCast() {
		return cast;
	}

	public void setCast(String[] cast) {
		this.cast = cast;
	}

	public String[] getDirector() {
		return director;
	}

	public void setDirector(String[] director) {
		this.director = director;
	}

	public String getGenerics() {
		return generics;
	}

	public void setGenerics(String generics) {
		this.generics = generics;
	}

	public double getImdbRating() {
		return imdbRating;
	}

	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}

	@Override
	public String toString() {
		return "Movie [releaseYear=" + releaseYear + ", cast=" + Arrays.toString(cast) + ", director="
				+ Arrays.toString(director) + ", generics=" + generics + ", imdbRating=" + imdbRating + "]";
	}
	
	@Override
	public boolean isKidFriendly() {
		// TODO Auto-generated method stub
		return true;
	}


}
