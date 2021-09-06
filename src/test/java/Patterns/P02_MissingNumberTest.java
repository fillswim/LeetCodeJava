package Patterns;

import org.junit.Test;

import static org.junit.Assert.*;

public class P02_MissingNumberTest {

    private P02_MissingNumber mn = new P02_MissingNumber();

    @Test
    public void missingNumber() {
        assertEquals(2, mn.missingNumber(new int[]{3, 0, 1}));
        assertEquals(2, mn.missingNumber(new int[]{0, 1}));
        assertEquals(8, mn.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        assertEquals(1, mn.missingNumber(new int[]{0}));
    }
}