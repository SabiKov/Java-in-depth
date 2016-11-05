package net.ddns.sabi11.thrillio;

import net.ddns.sabi11.thrillio.controllers.BookmarkController;
import net.ddns.sabi11.thrillio.entities.Bookmark;
import net.ddns.sabi11.thrillio.entities.User;

public class View {
	
	public static void bookmark(User user, Bookmark[][] bookmarks) {
		
		System.out.println("\n " + user.getEmail() + " is bookmarking");
		
		for(int i = 0; i < DataStore.USER_BOOKMARK_LIMIT; i++) {
			
			int typeOffset = (int)Math.random() * DataStore.BOOKMARKS_TYPE_COUNT;
			int bookmarkOffset = (int)Math.random() * DataStore.BOOKMARKS_COUNT_PER_TYPE;
			
			Bookmark bookmark = bookmarks[typeOffset][bookmarkOffset]; 
			
			BookmarkController.getInsatance().saveUserBookmark(user, bookmark);
			
			System.out.println(bookmark);
		}
	}

}
