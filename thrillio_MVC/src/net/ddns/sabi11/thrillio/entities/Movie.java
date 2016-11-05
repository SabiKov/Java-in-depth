package net.ddns.sabi11.thrillio.entities;

import java.util.Arrays;

import net.ddns.sabi11.thrillio.constants.MovieGenre;

public class Movie extends Bookmark {

	//Attributes
	private int releaseYear;
	private String[] cast;
	private String[] directors;
	private String genre;
	private double imdbRating;
	
	//Getter and Setter
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
	public String[] getDirectors() {
		return directors;
	}
	public void setDirectors(String[] directors) {
		this.directors = directors;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(double imdbRating) {
		this.imdbRating = imdbRating;
	}
	
	@Override
	public String toString() {
		return "Movie [releaseYear=" + releaseYear + ", cast=" + Arrays.toString(cast) + ", directors="
				+ Arrays.toString(directors) + ", genre=" + genre + ", imdbRating=" + imdbRating + "]";
	}
	@Override
	public boolean isKidsFriendlyEligible() {
		
		if(genre.equalsIgnoreCase(MovieGenre.HORROR) || genre.equalsIgnoreCase(MovieGenre.THRILLERS)) {
			
			return false;
		}
		return true;
	}
	
	
}
