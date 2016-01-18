package tree.sumroottoleafnums;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/19/16.
 */
public class SumRootToLeafNumsTest {
    private SumRootToLeafNums algo;
    private TreeNode tree;

    @Before
    public void setUp() throws Exception {
        algo = new SumRootToLeafNums();
        tree = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        tree.left = node2;
        tree.right = node3;
        node3.left = node4;
        node3.right = node5;
    }

    @Test
    public void testSumRootToleafNums() throws Exception {
        int expected = 281;
        assertEquals(expected, algo.getNums(tree));
    }
}
