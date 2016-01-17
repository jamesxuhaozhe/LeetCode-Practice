package tree.minidepthofbinarytree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/17/16.
 */
public class MiniDepthOfBinaryTreeTest {

    private MiniDepthOfBinaryTree algo;

    @Before
    public void setUp() throws Exception {
        algo = new MiniDepthOfBinaryTree();
    }

    @Test
    public void testMiniDepth() throws Exception {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(6);
        TreeNode node = new TreeNode(5);
        root.left = left;
        root.right = right;
        root.left = node;
        assertEquals(2, algo.getMiniDepth(root));
    }
}
