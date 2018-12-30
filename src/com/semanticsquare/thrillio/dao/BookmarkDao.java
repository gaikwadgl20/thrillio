package com.semanticsquare.thrillio.dao;

import com.semanticsquare.thrillio.DataStore;
import com.semanticsquare.thrillio.entity.Bookmark;

public class BookmarkDao {

	public Bookmark[][] getBookmarks(){
		return DataStore.getBookmarks();
	}
}
