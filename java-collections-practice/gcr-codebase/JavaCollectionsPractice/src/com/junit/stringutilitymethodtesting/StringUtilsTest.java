package com.junit.stringutilitymethodtesting;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {
	
	StringUtils su=new StringUtils();
	
	@Test
	public void testReverse() {
		assertEquals("dcba", su.reverse("abcd"));
	}
	
	@Test
    public void testIsPalindromeTrue() {
        assertTrue(su.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindromeFalse() {
        assertFalse(su.isPalindrome("java"));
    }

    @Test
    public void testToUpperCase() {
        assertEquals("HELLO", su.toUpperCase("hello"));
    }

}
