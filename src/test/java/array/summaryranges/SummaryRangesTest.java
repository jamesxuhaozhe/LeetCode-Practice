package array.summaryranges;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/21/16.
 */
public class SummaryRangesTest {
    private SummaryRanges algo;
    private int[] nums;

    @Before
    public void setUp() throws Exception {
        algo = new SummaryRanges();
        nums = new int[] {1, 2, 3, 5, 6, 8, 9};
    }

    @Test
    public void testSummaryRanges() throws Exception {
        List<String> expected = Arrays.asList("1->3", "5->6", "8->9");
        assertEquals(expected.toString(), algo.summaryRanges(nums).toString());
    }
}
