package array.movezeros;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class MoveZerosTest {
    private MoveZeros algo;

    @Before
    public void setUp() throws Exception {
        algo = new MoveZeros();
    }

    @Test
    public void testMoveZeros() throws Exception {
        int[] test = new int[] {0, 1, 0, 3, 12};
        int[] expected = new int[] {1, 3, 12, 0, 0};
        algo.removeZeros(test);
        assertArrayEquals(expected, test);
    }
}
