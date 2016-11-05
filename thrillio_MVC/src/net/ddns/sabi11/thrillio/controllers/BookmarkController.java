package net.ddns.sabi11.thrillio.controllers;

import net.ddns.sabi11.thrillio.entities.Bookmark;
import net.ddns.sabi11.thrillio.entities.User;
import net.ddns.sabi11.thrillio.managers.BookmarkManager;

public class BookmarkController {

	private static BookmarkController instance = new BookmarkController();
	
	//Private constructor
	private BookmarkController() {}
	
	//Create a global access point to the BookmarkController class
	public static BookmarkController getInsatance() {
		
		return instance;
	}

	public void saveUserBookmark(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().saveUserBookmark(user, bookmark);
		
	}

	public void setKidFriendlyStatus(User user, String kidFriendlyStatus, Bookmark bookmark) {
		
		BookmarkManager.getInstance().setKidFriendlyStatus(user, kidFriendlyStatus, bookmark);
		
	}

	public void share(User user, Bookmark bookmark) {
		BookmarkManager.getInstance().share(user, bookmark);
		
	}
}
