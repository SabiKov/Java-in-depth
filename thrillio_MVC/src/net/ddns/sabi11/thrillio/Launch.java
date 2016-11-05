package net.ddns.sabi11.thrillio;

import net.ddns.sabi11.thrillio.entities.Bookmark;
import net.ddns.sabi11.thrillio.entities.User;
import net.ddns.sabi11.thrillio.managers.BookmarkManager;
import net.ddns.sabi11.thrillio.managers.UserManager;

public class Launch {
	
	//Instance variables
	private static User[] users;
	private static Bookmark[][] bookmarks;
	
	private static void loadData() {
		System.out.println("1. Loading data ... ");
		DataStore.loadData();
		
		//Initializing User and Bookmark instances
		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		//System.out.println("Printing data ... ");
		//printUserData();
		//printBookmarkData();
		
	}
	
	private static void printBookmarkData() {

		for(Bookmark[] bookmarkList : bookmarks) {
			for(Bookmark bookmark : bookmarkList) {
				System.out.println(bookmark);
			}
		}
		
	}

	private static void printUserData() {
	
		for(User user : users) {
			System.out.println(user);
		}
		
	}
	

	private static void start() {
		System.out.println("\n2. Bookmarking ... ");
		for(User user : users) {
			View.browse(user, bookmarks);
		}
		
	}

	public static void main(String[] args) {
		
		loadData();
		start();

	}

}
