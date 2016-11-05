package net.ddns.sabi11.thrillio.entities;

import java.util.Arrays;

import net.ddns.sabi11.thrillio.constants.BookGenre;

public class Book extends Bookmark {

	private int publicationYear;
	private String publisher;
	private String[] author;
	private String genre;
	private double amazonRating;
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String[] getAuthor() {
		return author;
	}
	public void setAuthor(String[] author) {
		this.author = author;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getAmazonRating() {
		return amazonRating;
	}
	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}
	
	@Override
	public String toString() {
		return "Book [publicationYear=" + publicationYear + ", publisher=" + publisher + ", author="
				+ Arrays.toString(author) + ", genre=" + genre + ", amazonRating=" + amazonRating + "]";
	}
	@Override
	public boolean isKidsFriendlyEligible() {
		
		if(genre.equalsIgnoreCase(BookGenre.PHILOSOPHY) || genre.equalsIgnoreCase(BookGenre.SELF_HELP)) {
			return false;
		}
		
		return true;
	}
}
