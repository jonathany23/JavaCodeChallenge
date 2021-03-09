package org.jonathany23.challenge.arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterRepogramingTest {

    @Test
    public void chracter_reprograming_1() {
        assertEquals(2, CharacterRepograming.getMaxDeletions("URDR"));
    }

    @Test
    public void chracter_reprograming_2() {
        assertEquals(0, CharacterRepograming.getMaxDeletions("RRR"));
    }

    @Test
    public void chracter_reprograming_3() {
        assertEquals(4, CharacterRepograming.getMaxDeletions("RUDRL"));
    }
}