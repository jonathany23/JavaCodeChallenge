package org.jonathany23.challenge.arrays;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProcessSchedulingTest {

    private ProcessScheduling processScheduling;

    @Before
    public void setUp() throws Exception {
        processScheduling = new ProcessScheduling();
    }

    @Test
    public void pricess_scheduling_test1() {
        List<Integer> ability = Arrays.asList(3,1,4,2);
        long processed = 3;
        Integer result = processScheduling.minimunTime(ability, processed);
        assertEquals((Integer) 1, result);
    }

    @Test
    public void pricess_scheduling_test2() {
        ProcessScheduling processScheduling = new ProcessScheduling();
        List<Integer> ability = Arrays.asList(2,1,5,3,1);
        long processed = 17;
        Integer result = processScheduling.minimunTime(ability, processed);
        assertEquals((Integer) 1, result);
    }

    @Test
    public void pricess_scheduling_test3() {
        ProcessScheduling processScheduling = new ProcessScheduling();
        List<Integer> ability = Arrays.asList(138, 131, 152, 188, 174, 107, 167, 198, 191, 160,
                145, 181, 93, 173, 157, 80, 188, 113, 190, 195,
                200, 195, 171, 157, 185, 193, 172, 200, 195, 100,
                162, 183, 179, 135, 86, 184, 186, 107, 172, 191,
                165, 130, 193, 190, 199, 164, 131, 176, 152, 173);
        long processed = 12407;
        Integer result = processScheduling.minimunTime(ability, processed);
        assertEquals((Integer) 105, result);
    }

    @Test
    public void pricess_scheduling_test4() {
        ProcessScheduling processScheduling = new ProcessScheduling();
        List<Integer> ability = Arrays.asList(150, 182, 178, 192, 121, 196, 153, 185, 178, 197, 152, 192, 106, 191, 172, 129, 137, 198, 163, 134, 160, 190, 169, 134, 161, 128, 198, 176, 100, 188, 188, 162, 188, 164, 142, 191, 156, 162, 195, 189, 164, 173, 187, 129, 177, 164, 138, 177, 167, 197);
        long processed = 13916;
        Integer result = processScheduling.minimunTime(ability, processed);
        assertEquals((Integer) 132, result);
    }
}