package net.ddns.sabi11.thrillio.entities;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import net.ddns.sabi11.thrillio.constants.BookGenre;
import net.ddns.sabi11.thrillio.partner.Shareable;

public class Book extends Bookmark implements Shareable {

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
	@Override
	public String getItemData() {
		
		StringBuilder builder = new StringBuilder();
		builder.append("<item>");
			builder.append("<type>Book</type>");
			builder.append("<title>").append(getTitle()).append("</title>");
			builder.append("<authors>").append(StringUtils.join(author, ", ")).append("</authors>");
			builder.append("<publisher>").append(getPublisher()).append("</publisher>");
			builder.append("<publicationYear>").append(getPublicationYear()).append("</publicationYear>");
			builder.append("<genre>").append(genre).append("</genre>");
			builder.append("<amazonRating>").append(amazonRating).append("</amazonRating>");
		builder.append("</item>");
		
		return builder.toString();
	}
}
