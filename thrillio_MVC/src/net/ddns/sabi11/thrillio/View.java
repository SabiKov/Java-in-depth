package net.ddns.sabi11.thrillio;

import static org.hamcrest.CoreMatchers.instanceOf;

import net.ddns.sabi11.thrillio.constants.KidFriendlyStatus;
import net.ddns.sabi11.thrillio.constants.UserType;
import net.ddns.sabi11.thrillio.controllers.BookmarkController;
import net.ddns.sabi11.thrillio.entities.Bookmark;
import net.ddns.sabi11.thrillio.entities.User;
import net.ddns.sabi11.thrillio.partner.Shareable;

public class View {
	
	
	public static void browse(User user, Bookmark[][] bookmarks) {
		
		System.out.println("\n " + user.getEmail() + " is browsing items ...");
		
		int bookmarkCount = 0;
		
		for(Bookmark[] bookmarkList : bookmarks) {
			for(Bookmark bookmark : bookmarkList) {
				//Bookmarking
				if(bookmarkCount < DataStore.USER_BOOKMARK_LIMIT) {
					boolean isBookmarked = getBookmarkDecision(bookmark);
					if(isBookmarked) {
						bookmarkCount++;
						
						BookmarkController.getInsatance().saveUserBookmark(user, bookmark);
						System.out.println("New Item Bookmarked " + bookmark);
					}
				}
				
				if(user.getUserType().equals(UserType.EDITOR)
						|| user.getUserType().equals(UserType.CHIEF_EDITOR)) {
					
					// Mark as kid-friendly
					if(bookmark.isKidsFriendlyEligible()
							&& bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.UNKNOWN)) {
						
						String kidFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
						
						if(!kidFriendlyStatus.equals(KidFriendlyStatus.UNKNOWN)) {
							BookmarkController.getInsatance().setKidFriendlyStatus(user,kidFriendlyStatus, bookmark);
						}
					}
					
					//Sharing
					if(bookmark.getKidFriendlyStatus().equals(KidFriendlyStatus.APPROVED)
							&& bookmark instanceof Shareable) {
						
						boolean isShared = getShareDecision();
						
						if(isShared) {
							BookmarkController.getInsatance().share(user, bookmark);
						}
					}
				}
			}		
		}
	}

	// TODO: Below methods simulate user input. After IO, we take input via console
	private static boolean getShareDecision() {
		
		return Math.random() < 0.5 ? true : false;
		
	}

	private static String getKidFriendlyStatusDecision(Bookmark bookmark) {
		
		return Math.random() < 0.4 ? KidFriendlyStatus.APPROVED : 
			(Math.random() >= 0.4 && Math.random() < 0.8) ? KidFriendlyStatus.REJECTED :
				KidFriendlyStatus.UNKNOWN;
	}

	private static boolean getBookmarkDecision(Bookmark bookmark) {
		
		return Math.random() < 0.5 ? true : false;
	}
	
	/*
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
*/
}
