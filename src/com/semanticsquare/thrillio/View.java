package com.semanticsquare.thrillio;

import com.semanticsquare.thrillio.constants.KidFriendlyStatus;
import com.semanticsquare.thrillio.constants.UserType;
import com.semanticsquare.thrillio.controller.BookmarkController;
import com.semanticsquare.thrillio.entity.Bookmark;
import com.semanticsquare.thrillio.entity.User;
import com.semanticsquare.thrillio.entity.WebLink;
import com.semanticsquare.thrillio.managers.BookmarkManager;

public class View {
	/*
	 * public static void bookmark(User user, Bookmark[][] bookmarks ) {
	 * System.out.println("\n"+ user.getEmail() + "is bookmarking."); for(int i=0;
	 * i<DataStore.USE_BOOKMARK_LIMIT; i++) { int typeOffset = (int) (Math.random()
	 * * (DataStore.BOOKMARK_TYPE_COUNT)); int bookmarkOffset = (int)(Math.random()
	 * * DataStore.BOOKMARK_COUNT_PER_TYPE);
	 * 
	 * Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset];
	 * 
	 * BookmarkController.getInstance().saveUserBookmark(user ,bookmark);
	 * //System.out.println(bookmark);
	 * 
	 * 
	 * WebLink weblink = BookmarkManager.getInstance().createWebLink(
	 * "http://www.javaworld.com/article/2072759/core-java/taming-URL--part-2.html",
	 * "http://www.javaworld.com", 2000, "Taming Tiger, Part 2");
	 * //System.out.println(weblink); weblink.isKidFriendly(); } }
	 */

	public static void browse(User user, Bookmark[][] bookmarks) {

		System.out.println("\n" + user.getEmail() + "is Browsing items....");
		int bookmarkingCount = 0;
		for (Bookmark[] bookmarkList : bookmarks) {
			for (Bookmark bookmark : bookmarkList) {
				if (bookmarkingCount < DataStore.USE_BOOKMARK_LIMIT) {
					boolean isBookmarked = getBookmarkDecision(bookmark);

					if (isBookmarked) {
						BookmarkController.getInstance().saveUserBookmark(user, bookmark);
						bookmarkingCount++;
						System.out.println("New Bookmark Added.... " + bookmark);
					}
					if (user.getUserType().equals(UserType.EDITOR)
							|| user.getUserType().equals(UserType.CHIEF_EDITOR)) {
						if (bookmark.isKidFriendly()
								&& bookmark.getIsKidFriendlyStatus().equals(KidFriendlyStatus.UNKNOWN)) {
							String isKindfriendlyStatus= getIsKidFriendlyDecision(bookmark);
							if(! (isKindfriendlyStatus.equals(KidFriendlyStatus.UNKNOWN))) {
								bookmark.setIsKidFriendlyStatus(isKindfriendlyStatus);
								System.out.println("Kid Friendly Status : " + isKindfriendlyStatus + "," + bookmark);
							}
						}

					}
				}
			}
		}
	}

	private static String getIsKidFriendlyDecision(Bookmark bookmark) {
		return Math.random() < 0.4 ? KidFriendlyStatus.APPROVED
				: ((Math.random() >= 0.4 && Math.random() < 0.8) ? KidFriendlyStatus.REJECTED
						: KidFriendlyStatus.UNKNOWN);
	}

	private static boolean getBookmarkDecision(Bookmark bookmark) {
		// TODO Auto-generated method stub
		return Math.random() < 0.5 ? true : false;

	}

}
