package array.removeduplicatefromsortedarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class RemoveDurplicateFromSortedArrayTest {
    private RemoveDurplicateFromSortedArray algo;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        algo = new RemoveDurplicateFromSortedArray();
        nums = new int[] {1, 1, 2, 3, 3, 4};
    }

    @Test
    public void testRemove() throws Exception {
        int expected = 4;
        assertEquals(expected, algo.removeDuplicates(nums));
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
