package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.controller.BookmarkController;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;
import com.semanticsquare.thrillio.entities.WebLink;
import com.semanticsquare.thrillio.managers.BookmarkManager;

public class View {
	public static void bookmark(User user, Bookmark[][] bookmarks ) {
		System.out.println("\n"+ user.getEmail() + "is bookmarking.");
		for(int i=0; i<DataStore.USE_BOOKMARK_LIMIT; i++) {
			int typeOffset = (int) (Math.random() * (DataStore.BOOKMARK_TYPE_COUNT));
			int bookmarkOffset = (int)(Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPE);
			
			Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
			
			BookmarkController.getInstance().saveUserBookmark(user ,bookmark);
			//System.out.println(bookmark);
			
			
			WebLink weblink =	BookmarkManager.getInstance().createWebLink(
						"http://www.javaworld.com/article/2072759/core-java/taming-URL--part-2.html",
						"http://www.javaworld.com", 2000, "Taming Tiger, Part 2");
				//System.out.println(weblink); 
		}
	}
}
