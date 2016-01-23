package array.containsdupilcate;

import array.containsduplicate.ContainsDuplicateArray;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class ContainsDuplicateArrayTest {
    private ContainsDuplicateArray algo;

    @Before
    public void setUp() throws Exception {
        algo = new ContainsDuplicateArray();
    }

    @Test
    public void testHasDup() throws Exception {
        int[] nums = new int[] {1, 2, 2, 3};
        assertTrue(algo.containsDuplicate(nums));
    }

    @Test
    public void testNoDup() throws Exception {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        assertFalse(algo.containsDuplicate(nums));
    }
}
