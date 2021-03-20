package org.jonathany23.challenge.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class PermutationTest {

    @Test
    public void is_a_permutation() {
        assertFalse(Permutation.is_permutation(null, "foo"));
        assertFalse(Permutation.is_permutation("", "foo"));
        assertFalse(Permutation.is_permutation("Nib", "bin"));
        assertTrue(Permutation.is_permutation("act", "cat"));
        assertTrue(Permutation.is_permutation("a ct", "ca t"));
        assertFalse(Permutation.is_permutation("dog", "doggo"));
    }

    @Test
    public void is_a_permutation2() {
        assertFalse(Permutation.is_permutation2(null, "foo"));
        assertFalse(Permutation.is_permutation2("", "foo"));
        assertFalse(Permutation.is_permutation2("Nib", "bin"));
        assertTrue(Permutation.is_permutation2("act", "cat"));
        assertTrue(Permutation.is_permutation2("a ct", "ca t"));
        assertFalse(Permutation.is_permutation2("dog", "doggo"));
    }

    @Test
    public void is_a_permutation3() {
        assertFalse(Permutation.is_permutation3(null, "foo"));
        assertFalse(Permutation.is_permutation3("", "foo"));
        assertFalse(Permutation.is_permutation3("Nib", "bin"));
        assertTrue(Permutation.is_permutation3("act", "cat"));
        assertTrue(Permutation.is_permutation3("a ct", "ca t"));
        assertFalse(Permutation.is_permutation3("dog", "doggo"));
    }
}