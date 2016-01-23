package array.containsduplicate2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class ContainsDuplicate2Test {
    private ContainsDuplicate2 algo;

    @Before
    public void setUp() throws Exception {
        algo = new ContainsDuplicate2();
    }

    @Test
    public void testContainsDuplicate() throws Exception {
        int[] test = new int[] {1, 2, 3, 4, 5, 6, 5};
        assertTrue(algo.containsDuplicate(test, 3));
    }
}
