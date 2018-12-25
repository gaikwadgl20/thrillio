package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.dao.BookmarkDao;
import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.Movie;
import com.semanticsquare.thrillio.entities.WebLink;

public class BookmarkManager {
	private static BookmarkManager instance = new BookmarkManager();
	private static BookmarkDao dao = new BookmarkDao();
	private BookmarkManager() {
	}

	public static BookmarkManager getInstance() {
		return instance;
	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] director, String generics, double imdbRating) {
		Movie movie = new Movie();
		movie.setCast(cast);
		movie.setDirector(director);
		movie.setGenerics(generics);
		movie.setId(id);
		movie.setImdbRating(imdbRating);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setTitle(title);

		return movie;
	}

	public Book createBook(long id, String title, int publicationYear, String publisher, String[] authors, String genre,
			double amazonRating) {
		Book book = new Book();
		book.setAmazonRating(amazonRating);
		book.setAuthors(authors);
		book.setGenre(genre);
		book.setId(id);
		book.setPublicationYear(publicationYear);
		book.setPublisher(publisher);
		book.setTitle(title);

		return book;

	}

	public WebLink createWebLink(String url, String host, long id, String title) {
		WebLink weblink = new WebLink();

		weblink.setHost(host);
		weblink.setId(id);
		weblink.setUrl(url);
		weblink.setTitle(title);

		return weblink;
	}
	
	public Bookmark[][] getBookmark(){
		return dao.getBookmarks();
	}

}
