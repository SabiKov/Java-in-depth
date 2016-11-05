package net.ddns.sabi11.thrillio.managers;

import net.ddns.sabi11.thrillio.dao.BookmarkDao;
import net.ddns.sabi11.thrillio.entities.Book;
import net.ddns.sabi11.thrillio.entities.Bookmark;
import net.ddns.sabi11.thrillio.entities.Movie;
import net.ddns.sabi11.thrillio.entities.User;
import net.ddns.sabi11.thrillio.entities.UserBookmark;
import net.ddns.sabi11.thrillio.entities.WebLink;

public class BookmarkManager {

	//Create a single instance of this class
	private static BookmarkManager instance = new BookmarkManager();
	private static BookmarkDao dao = new BookmarkDao();

	// Singleton
	private BookmarkManager() {
	}

	//Returns a single instance of single UserManager
	public static BookmarkManager getInstance() {

		return instance;
	}

	//Method creates a new movie object by passing all parameters to the setters
	public Movie createMovie(
			long id
			, String title
			, String profileUrl
			, int releaseYear
			, String[] cast
			, String[] directors
			, String genre
			, double imdbRating) {
		
		Movie movie = new Movie();
		
		//Set movie's attributes
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenre(genre);
		movie.setImdbRating(imdbRating);
		
		return movie;
	}
	
	//Method creates a new book object by passing all parameters to the setter
	public Book createBook(
			long id
			, String title
			, int publicationYear
			, String publisher
			, String[] author
			, String genre
			, double amazonRating) {
		
		//Set book's attributes
		Book book = new Book();
		book.setId(id);
		book.setTitle(title);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setAuthor(author);
		book.setGenre(genre);
		book.setAmazonRating(amazonRating);
		
		return book;
	}

	//Method creates a new weblink object by passing all parameters to the setter
	public WebLink creatWebLink(
			long id
			, String title
			, String url
			, String host) {
		
		WebLink webLink = new WebLink();
		
		//Set webLink's attributes
		webLink.setId(id);
		webLink.setTitle(title);
		webLink.setUrl(url);
		webLink.setHost(host);
		
		return webLink;
		
	}
	
	public Bookmark[][] getBookmarks() {
		
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		
		UserBookmark userBookmark = new UserBookmark();
		userBookmark.setUser(user);
		userBookmark.setBookmark(bookmark);
		
		dao.saveUserBookmark(userBookmark);
	}
}
