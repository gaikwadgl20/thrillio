package com.semanticsquare.thrillio.entities;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.entities.*;

class WebLinkTest {
	@Test
	void testIsKidFriendly() {
		
		// Test 1 : porn in URL -->  False
		
	WebLink weblink =	BookmarkManager.getInstance().createWebLink(
				"http://www.javaworld.com/article/2072759/core-java/taming-Porn-URL--part-2.html",
				"http://www.javaworld.com", 2000, "Taming Tiger, Part 2");
		System.out.println(weblink); 
		boolean testIsKidFriendlyEligible =  weblink.isKidFriendly();
		
		assertfalse("For Porn in URl",testIsKidFriendlyEligible )
		
		System.out.println("Test "+test);
		// Test 2 : porn in title -->  False
		
		// Test 3 : adult in host --> False
		
		// Test 4 : adult in url, but not in host part --> True
		
		// Test 5 : Adult in title Only --> True
		fail("Not yet implemented");
	}

}
