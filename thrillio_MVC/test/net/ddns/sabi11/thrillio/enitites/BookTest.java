package net.ddns.sabi11.thrillio.enitites;

import static org.junit.Assert.*;


import org.junit.Test;

import net.ddns.sabi11.thrillio.constants.BookGenre;
import net.ddns.sabi11.thrillio.entities.Book;
import net.ddns.sabi11.thrillio.managers.BookmarkManager;

public class BookTest {

	@Test
	public void testIsKidsFriendlyEligible() {

		// Test 1
		Book book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",	new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY,	4.3);
	
		boolean isKidFriendlyEligible = book.isKidsFriendlyEligible();
		
		assertFalse("For Philosophy Genre - isKidFriendlyEligible should return false", isKidFriendlyEligible);
		
		// Test 2
		book = BookmarkManager.getInstance().createBook(4000, "Walden", 1854, "Wilder Publications",	new String[] {"Henry David Thoreau"}, BookGenre.SELF_HELP,	4.3);
		
		isKidFriendlyEligible = book.isKidsFriendlyEligible();
		
		assertFalse("For Self help Genre - isKidFriendlyEligible should return false", isKidFriendlyEligible);
		
	}

}
