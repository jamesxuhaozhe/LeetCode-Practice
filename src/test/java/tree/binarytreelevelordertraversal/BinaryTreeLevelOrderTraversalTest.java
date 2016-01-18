package tree.binarytreelevelordertraversal;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/18/16.
 */
public class BinaryTreeLevelOrderTraversalTest {
    private BinaryTreelevelOrderTraversal algo;
    private TreeNode tree;

    @Before
    public void setUp() throws Exception {
        algo = new BinaryTreelevelOrderTraversal();
        tree = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node6 = new TreeNode(6);
        TreeNode node9 = new TreeNode(9);
        tree.left = node2;
        tree.right = node7;
        node2.left = node1;
        node2.right = node3;
        node7.left = node6;
        node7.right = node9;
    }

    @Test
    public void testBinaryTreeLevelOrderTraversal() throws Exception {
        String expected = "[[4], [2, 7], [1, 3, 6, 9]]";
        assertEquals(expected, algo.traverse(tree).toString());
    }
}
