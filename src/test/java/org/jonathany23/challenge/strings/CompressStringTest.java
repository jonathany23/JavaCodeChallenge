package org.jonathany23.challenge.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompressStringTest {

    @Test
    public void test_compress_string() {
        assertNull(CompressString.compressString(null));
        assertEquals("", CompressString.compressString(""));
        assertEquals("AABBCC", CompressString.compressString("AABBCC"));
        assertEquals("A3BCCD4E", CompressString.compressString("AAABCCDDDDE"));
        assertEquals("BA3CCD4", CompressString.compressString("BAAACCDDDD"));
        assertEquals("A3BAACCD4", CompressString.compressString("AAABAACCDDDD"));
        System.out.println("Success: test_compress");
    }

    @Test
    public void test_compress_string2() {
        assertNull(CompressString.compressString(null));
        assertEquals("", CompressString.compressString2(""));
        assertEquals("AABBCC", CompressString.compressString2("AABBCC"));
        assertEquals("A3BC2D4E", CompressString.compressString2("AAABCCDDDDE"));
        assertEquals("BA3C2D4", CompressString.compressString2("BAAACCDDDD"));
        assertEquals("A3BA2C2D4", CompressString.compressString2("AAABAACCDDDD"));
        System.out.println("Success: test_compress");
    }
}