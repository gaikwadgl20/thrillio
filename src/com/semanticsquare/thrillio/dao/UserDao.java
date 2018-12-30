package com.semanticsquare.thrillio.dao;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entity.User;
import com.semanticsquare.thrillio.entity.UserBookmark;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}

	public void saveUserBookmark(UserBookmark userbookmark) {
		DataStore.add(userbookmark);
	}
}
