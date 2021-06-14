package org.jonathany23.challenge.strings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverse() {
        assertNull(ReverseString.reverse(null));

        String [] emptyArr = {""};
        assertArrayEquals(emptyArr, ReverseString.reverse(emptyArr));

        String [] arr = {"f", "o", "o", " ", "b", "a", "r"};
        String [] testArr = {"r", "a", "b", " ", "o", "o", "f"};
        assertArrayEquals(testArr, ReverseString.reverse(arr));
    }
}