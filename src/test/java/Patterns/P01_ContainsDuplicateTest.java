package Patterns;

import org.junit.Test;

import static org.junit.Assert.*;

public class P01_ContainsDuplicateTest {

    P01_ContainsDuplicate cd = new P01_ContainsDuplicate();

    @Test
    public void containsDuplicate() {

        assertEquals(true, cd.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertEquals(false, cd.containsDuplicate(new int[]{1, 2, 3, 4}));
        assertEquals(true, cd.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

    }
}