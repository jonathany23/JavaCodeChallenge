package org.jonathany23.challenge.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharactersTest {

    @Test
    public void test_unique_chars() {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        assertEquals(false, uniqueCharacters.has_unique_chars(null));
        assertEquals(true, uniqueCharacters.has_unique_chars(""));
        assertEquals(false, uniqueCharacters.has_unique_chars("foo"));
        assertEquals(true, uniqueCharacters.has_unique_chars("bar"));
        assertEquals(false, uniqueCharacters.has_unique_chars("barB"));
    }

    @Test
    public void test_unique_chars_Set() {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        assertEquals(false, uniqueCharacters.has_unique_charsSet(null));
        assertEquals(true, uniqueCharacters.has_unique_charsSet(""));
        assertEquals(false, uniqueCharacters.has_unique_charsSet("foo"));
        assertEquals(true, uniqueCharacters.has_unique_charsSet("bar"));
        assertEquals(false, uniqueCharacters.has_unique_charsSet("barB"));
    }

    @Test
    public void test_unique_chars_streams() {
        UniqueCharacters uniqueCharacters = new UniqueCharacters();
        assertEquals(false, uniqueCharacters.has_unique_chars_strems(null));
        assertEquals(true, uniqueCharacters.has_unique_chars_strems(""));
        assertEquals(false, uniqueCharacters.has_unique_chars_strems("foo"));
        assertEquals(true, uniqueCharacters.has_unique_chars_strems("bar"));
        assertEquals(false, uniqueCharacters.has_unique_chars_strems("barB"));
    }
}