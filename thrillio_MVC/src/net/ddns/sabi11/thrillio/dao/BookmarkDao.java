package net.ddns.sabi11.thrillio.dao;

import net.ddns.sabi11.thrillio.DataStore;
import net.ddns.sabi11.thrillio.entities.Bookmark;
import net.ddns.sabi11.thrillio.entities.UserBookmark;

public class BookmarkDao {

	public Bookmark[][] getBookmarks() {
		
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		
		DataStore.add(userBookmark);
		
	}
}
