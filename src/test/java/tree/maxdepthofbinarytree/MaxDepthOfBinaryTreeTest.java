package tree.maxdepthofbinarytree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/17/16.
 */
public class MaxDepthOfBinaryTreeTest {
    private MaxDepthOfBinaryTree algo;

    @Before
    public void SetUp() throws Exception {
        algo = new MaxDepthOfBinaryTree();
    }

    @Test
    public void testMaxDepthOfBinaryTree() throws Exception {
        TreeNode tree = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        tree.left = left;
        tree.right = right;
        tree.right.right = new TreeNode(6);
        tree.right.right.right = new TreeNode(6);
        assertEquals(4, algo.getMaxDepth(tree));
    }
}
