package com.semanticsquare.thrillio.controller;

import com.semanticsquare.thrillio.entity.Bookmark;
import com.semanticsquare.thrillio.entity.User;
import com.semanticsquare.thrillio.managers.UserManager;

public class BookmarkController {
		private static BookmarkController instance = new BookmarkController();
		private BookmarkController() {}
		
		public static BookmarkController getInstance() {
			return instance;
		}

		public void saveUserBookmark(User user, Bookmark bookmark) {
			// TODO Auto-generated method stub
			UserManager.getInstance().saveUserBookmark(user,bookmark);
		}
		
}
