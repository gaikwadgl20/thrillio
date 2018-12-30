package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.constants.BookGenre;
import com.semanticsquare.thrillio.constants.MovieGenre;
import com.semanticsquare.thrillio.entity.Bookmark;
import com.semanticsquare.thrillio.entity.User;
import com.semanticsquare.thrillio.entity.UserBookmark;
import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.managers.UserManager;

public class DataStore {
	public static final int USE_BOOKMARK_LIMIT = 5;
	public static final int BOOKMARK_COUNT_PER_TYPE = 5;
	public static final int BOOKMARK_TYPE_COUNT = 3;
	public static final int TOTAL_USER_COUNT = 5;
	public static User[] users = new User[TOTAL_USER_COUNT];

	public static User[] getUsers() {
		return users;
	}

	private static Bookmark[][] bookmarks = new Bookmark[BOOKMARK_TYPE_COUNT][BOOKMARK_COUNT_PER_TYPE];

	public static Bookmark[][] getBookmarks() {
		return bookmarks;
	}

	private static UserBookmark[] userBookmarks = new UserBookmark[TOTAL_USER_COUNT * USE_BOOKMARK_LIMIT];
	private static int bookmarkIndex = 0;
	
	public static void loadData() {
		loadUsers();
		loadWebLinks();
		loadMovies();
		loadBooks();
	}

	private static void loadUsers() {
		users[0] = UserManager.getInstance().createUser(1000, "user0@semanticsquare.com", "test", "John", "M", 0,
				"user");
		users[1] = UserManager.getInstance().createUser(1001, "user1@semanticsquare.com", "test", "Sam", "M", 0,
				"user");
		users[2] = UserManager.getInstance().createUser(1002, "user2@semanticsquare.com", "test", "Anita", "M", 0,
				"editor");
		users[3] = UserManager.getInstance().createUser(1003, "user3@semanticsquare.com", "test", "Sara", "M", 1,
				"editor");
		users[4] = UserManager.getInstance().createUser(1004, "user4@semanticsquare.com", "test", "Dheeru", "M", 0,
				"chiefeditor");

	}

	private static void loadWebLinks() {
		bookmarks[0][0] = BookmarkManager.getInstance().createWebLink(
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com", 2000, "Taming Tiger, Part 2");
		bookmarks[0][1] = BookmarkManager.getInstance().createWebLink(
				"http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running",
				"http://www.stackoverflow.com", 2001,
				"How do I import a pre-existing Java project into Eclipse and get up and running?");
		bookmarks[0][2] = BookmarkManager.getInstance().createWebLink(
				"http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com", 2002,
				"Interface vs Abstract Class");
		bookmarks[0][3] = BookmarkManager.getInstance().createWebLink(
				"http://cs.brown.edu/courses/cs161/papers/j-nio-ltr.pdf", "http://cs.brown.edu", 2003,
				"NIO tutorial by Greg Travis");
		bookmarks[0][4] = BookmarkManager.getInstance().createWebLink(
				"http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html", "http://tomcat.apache.org", 2004,
				"Virtual Hosting and Tomcat");

	}

	private static void loadMovies() {

		bookmarks[1][0] = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", "", 1941,
				new String[] { "Orson Welles", "Joseph Cotten" }, new String[] { "Orson Welles" }, MovieGenre.CLASSICS,
				8.5);
		bookmarks[1][1] = BookmarkManager.getInstance().createMovie(3001, "The Grapes of Wrath", "", 1940,
				new String[] { "Henry Fonda", "Jane Darwell" }, new String[] { "John Ford" }, MovieGenre.CLASSICS, 8.2);
		bookmarks[1][2] = BookmarkManager.getInstance().createMovie(3002, "A Touch of Greatness", "", 2004,
				new String[] { "Albert Cullum" }, new String[] { "Leslie Sullivan" }, MovieGenre.DOCUMENTARIES, 7.3);
		bookmarks[1][3] = BookmarkManager.getInstance().createMovie(3003, "The Big Bang Theory", "", 2007,
				new String[] { "Kaley Cuoco", "Jim Parsons" }, new String[] { "Chuck Lorre", "Bill Prady" },
				MovieGenre.TV_SHOWS, 8.7);
		bookmarks[1][4] = BookmarkManager.getInstance().createMovie(3004, "Ikiru", "", 1952,
				new String[] { "Takashi Shimura", "Minoru Chiaki" }, new String[] { "Akira Kurosawa" },
				MovieGenre.FOREIGN_MOVIES, 8.4);
	}

	private static void loadBooks() {

		bookmarks[2][0] = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",
				new String[] { "Henry David Thoreau" }, BookGenre.PHILOSOPHY, 4.3);
		bookmarks[2][1] = BookmarkManager.getInstance().createBook(4001, "Self-Reliance and Other Essays", 1993,
				"Dover Publications", new String[] { "Ralph Waldo Emerson" }, BookGenre.PHILOSOPHY, 4.5);
		bookmarks[2][2] = BookmarkManager.getInstance().createBook(4002, "Light From Many Lamps", 1988, "Touchstone",
				new String[] { "Lillian Eichler Watson" }, BookGenre.PHILOSOPHY, 5.0);
		bookmarks[2][3] = BookmarkManager.getInstance().createBook(4003, "Head First Design Patterns", 2004,
				"O'Reilly Media", new String[] { "Eric Freeman", "Bert Bates", "Kathy Sierra", "Elisabeth Robson" },
				BookGenre.PHILOSOPHY, 4.5);
		bookmarks[2][4] = BookmarkManager.getInstance().createBook(4004, "Effective Java Programming Language Guide",
				2007, "Prentice Hall", new String[] { "Joshua Bloch" }, BookGenre.PHILOSOPHY, 4.9);
	}

	public static void add(UserBookmark userbookmark) {
		userBookmarks[bookmarkIndex] = userbookmark;
		bookmarkIndex++;
	}
}
