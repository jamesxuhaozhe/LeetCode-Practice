package tree.sortedarraytobst;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;
import tree.sametree.IsSameTree;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/21/16.
 */
public class SortedArrayToBstTest {

    private SortedArrayToBST algo;
    private TreeNode tree;

    @Before
    public void setUp() throws Exception {
        algo = new SortedArrayToBST();
        tree = new TreeNode(2);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(3);
    }

    @Test
    public void testSortedArrayToBST() throws Exception {
        int[] arr = new int[] {1, 2, 3};
        assertTrue(new IsSameTree().isSameTree(algo.sortedArrayToBST(arr), tree));
    }
}
