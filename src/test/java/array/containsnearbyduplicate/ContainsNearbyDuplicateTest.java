package array.containsnearbyduplicate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/21/16.
 */
public class ContainsNearbyDuplicateTest {
    private ContainsNearbyDuplicate algo;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        algo = new ContainsNearbyDuplicate();
        nums = new int[] {1, 0, 1, 1};
    }

    @Test
    public void testContainsNearbyDuplicate() throws Exception {
        assertTrue(algo.containsNearbyDuplicate(nums, 1));
    }
}
