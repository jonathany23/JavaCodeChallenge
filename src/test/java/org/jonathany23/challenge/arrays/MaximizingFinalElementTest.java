package org.jonathany23.challenge.arrays;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MaximizingFinalElementTest {

    @Test
    public void maximize_final_element_test1() {
        assertEquals(4, MaximizingFinalElement.getMaxValue(Arrays.asList(3, 1, 3, 4)));
    }

    @Test
    public void maximize_final_element_test2() {
        assertEquals(3, MaximizingFinalElement.getMaxValue(Arrays.asList(1, 3, 2, 2)));
    }

    @Test
    public void maximize_final_element_test3() {
        assertEquals(4, MaximizingFinalElement.getMaxValue(Arrays.asList(3, 2, 3, 5)));
    }
}