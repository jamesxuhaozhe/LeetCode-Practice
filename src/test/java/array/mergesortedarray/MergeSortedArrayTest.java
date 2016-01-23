package array.mergesortedarray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/23/16.
 */
public class MergeSortedArrayTest {
    private MergeSortedArray algo;

    @Before
    public void setUp() throws Exception {
        algo = new MergeSortedArray();
    }

    @Test
    public void testMergeSortedArray() throws Exception {
        int[] nums1 = new int[] {1, 2, 3, 4, 5, 0, 0, 0};
        int[] nums2 = new int[] {5, 9, 10};
        int[] exppected = new int[] {1, 2, 3, 4, 5, 5, 9, 10};
        algo.merge(nums1, 5, nums2, 3);
        assertArrayEquals(exppected, nums1);
    }
}

