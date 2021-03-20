package org.jonathany23.challenge.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotationTest {

    @Test
    public void test_rotation1() {
        Rotation rotation = new Rotation();
        assertFalse(rotation.isRotation("o", "oo"));
        assertFalse(rotation.isRotation(null, "foo"));
        assertFalse(rotation.isRotation("", "foo"));
        assertTrue(rotation.isRotation("", ""));
        assertTrue(rotation.isRotation("foobarbaz", "barbazfoo"));
    }
}