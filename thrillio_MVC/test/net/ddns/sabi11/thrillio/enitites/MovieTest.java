package net.ddns.sabi11.thrillio.enitites;

import static org.junit.Assert.*;

import org.junit.Test;

import net.ddns.sabi11.thrillio.constants.MovieGenre;
import net.ddns.sabi11.thrillio.entities.Movie;
import net.ddns.sabi11.thrillio.managers.BookmarkManager;

public class MovieTest {

	@Test
	public void testIsKidsFriendlyEligible() {
		// Test 1: 
		Movie movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", " ", 1941, new String[] {"Orson Welles", "Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.HORROR, 8.5);
	
		boolean isKidFriendlyEligible = movie.isKidsFriendlyEligible();
		
		assertFalse("For Horror genre - isKidFirnedlyeligible should return flase", isKidFriendlyEligible);
	
		// Test 1: 
		movie = BookmarkManager.getInstance().createMovie(3000, "Citizen Kane", " ", 1941, new String[] {"Orson Welles", "Joseph Cotten"}, new String[] {"Orson Welles"}, MovieGenre.THRILLERS, 8.5);
			
		isKidFriendlyEligible = movie.isKidsFriendlyEligible();
				
		assertFalse("For Thrillers genre - isKidFirnedlyeligible should return flase", isKidFriendlyEligible);
			
	}

}
