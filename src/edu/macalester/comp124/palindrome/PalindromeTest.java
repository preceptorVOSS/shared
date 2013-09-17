package edu.macalester.comp124.palindrome;

import junit.framework.TestCase;


public class PalindromeTest extends TestCase {
	
	public void testPalindrome1() {
		Palindrome pal = new Palindrome();
		assertTrue(pal.isPalindrome("racecar"));
		assertFalse(pal.isPalindrome("racecarz"));
	}
	
	/*
	 * Write your own test methods below to test for fancier palindromes.
	 * Like the method above, each method MUST start with the word "test."
	 */
}
