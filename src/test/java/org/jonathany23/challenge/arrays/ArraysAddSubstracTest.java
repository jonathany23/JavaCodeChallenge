package org.jonathany23.challenge.arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArraysAddSubstracTest {

    private ArraysAddSubstrac arraysAddSubstrac;
    @Before
    public void setUp() throws Exception {
        arraysAddSubstrac = new ArraysAddSubstrac();
    }

    @Test
    public void array_test1() {
        List<Long> arr = Arrays.asList(2L, 4L, 3L);

        List<Long> expectedList = Arrays.asList(0L,2L,0L);

        List<Long> arrResult = arraysAddSubstrac.arrayChallenge(arr);
        assertEquals(expectedList, arrResult);
    }

    @Test
    public void array_test2() {
        List<Long> arr = Arrays.asList(2L, 1L, 3L);

        List<Long> expectedList = Arrays.asList(0L,-1L,3L);

        List<Long> arrResult = arraysAddSubstrac.arrayChallenge(arr);
        assertEquals(expectedList, arrResult);
    }
}