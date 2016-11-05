package net.ddns.sabi11.thrillio.enitites;

import static org.junit.Assert.*;

import org.junit.Test;

import net.ddns.sabi11.thrillio.entities.WebLink;
import net.ddns.sabi11.thrillio.managers.BookmarkManager;

public class WebLinkTest {

	@Test
	public void testIsKidsFriendlyEligible() {
		//Test 1: porn in url -- false
		WebLink webLink = BookmarkManager.getInstance().creatWebLink(2000, "Taming Tiger", "http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html", "http://www.javaworld.com");
		
		boolean isKidFriendlyEligible = webLink.isKidsFriendlyEligible();
		
		assertFalse("For porn in url - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
		
		//Test 2: porn in title --false
		webLink = BookmarkManager.getInstance().creatWebLink(2000, "Taming Porn", "http://www.javaworld.com/article/2072759/core-java/taming-part-2.html", "http://www.javaworld.com");
		
		isKidFriendlyEligible = webLink.isKidsFriendlyEligible();
		
		assertFalse("For porn in title - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
		
		//Test 3: adult in host -- false
		webLink = BookmarkManager.getInstance().creatWebLink(2000, "Taming Tiger", "http://www.javaworld.com/article/2072759/core-java/taming-part-tiger-2.html", "http://www.adult.com");
		
		isKidFriendlyEligible = webLink.isKidsFriendlyEligible();
		
		assertFalse("For adult in host - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
		
		//Test 4: adult in url, but not in host part -- true
		webLink = BookmarkManager.getInstance().creatWebLink(2000, "Taming Tiger", "http://www.javaworld.com/article/2072759/core-java/taming-part-adult-2.html", "http://www.javaworld.com");
		
		isKidFriendlyEligible = webLink.isKidsFriendlyEligible();
		
		assertTrue("For adult in url but not host - isKidFriendlyEligible() must return true", isKidFriendlyEligible);
		
		//Test 5 adult in title only -- true
		webLink = BookmarkManager.getInstance().creatWebLink(2000, "Taming Adult", "http://www.javaworld.com/article/2072759/core-java/taming-part-tiger-2.html", "http://www.javaworld.com");
		
		isKidFriendlyEligible = webLink.isKidsFriendlyEligible();
		
		assertTrue("For adult in title - isKidFriendlyEligible() must return true", isKidFriendlyEligible);
		
	}

}
