package algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by haozhexu on 1/2/19.
 */
public class TwoSum_1Test {

    private int[] array = new int[]{2, 7, 11, 15};

    private int target = 9;

    @Test
    public void testTwoSum() throws Exception {
        assertEquals(0, TwoSum_1.twoSum(array, target)[0]);
        assertEquals(1, TwoSum_1.twoSum(array, target)[1]);
    }

    @Test
    public void testTwoSumOptimized() throws Exception {
        assertEquals(1, TwoSum_1.twoSumOptimized(array, target)[0]);
        assertEquals(0, TwoSum_1.twoSumOptimized(array, target)[1]);
    }
}