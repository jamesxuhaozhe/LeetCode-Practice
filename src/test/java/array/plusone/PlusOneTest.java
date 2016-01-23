package array.plusone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class PlusOneTest {
    private PlusOne algo;
    private int[] digits;

    @Before
    public void setUp() throws Exception {
        algo = new PlusOne();
        digits = new int[] {1, 2, 3, 4, 5};
    }

    @Test
    public void testPlusOne() throws Exception {
        int[] expected = new int[] {1, 2, 3, 4, 6};
        assertArrayEquals(expected, algo.plusOne(digits));
    }

    @Test
    public void testPlusOneSecond() throws Exception {
        int[] test = new int[] {9, 9, 9};
        int[] expected = new int[] {1, 0, 0, 0};
        assertArrayEquals(expected, algo.plusOne(test));
    }
}
