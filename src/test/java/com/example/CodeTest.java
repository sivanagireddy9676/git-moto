package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodeTest {

    @Test
    void testAdd() {
        assertEquals(5, Code.add(2, 3));
        assertEquals(-1, Code.add(2, -3));
    }

    @Test
    void testReverse() {
        assertEquals("cba", Code.reverse("abc"));
        assertNull(Code.reverse(null));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(Code.isPalindrome("level"));
        assertFalse(Code.isPalindrome("hello"));
        assertFalse(Code.isPalindrome(null));
    }
}
