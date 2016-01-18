package tree.balancedbinarytree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/18/16.
 */
public class IsBalancedBinaryTreeTest {

    private IsBalancedBinaryTree algo;
    private TreeNode balancedTree;
    private TreeNode unBalancedTree;

    @Before
    public void setUp() throws Exception {
        algo = new IsBalancedBinaryTree();
        balancedTree = new TreeNode(1);
        TreeNode node2b = new TreeNode(2);
        TreeNode node7b = new TreeNode(7);
        TreeNode node1b = new TreeNode(1);
        TreeNode node3b = new TreeNode(3);
        TreeNode node6b = new TreeNode(6);
        TreeNode node9b = new TreeNode(9);

        balancedTree.left = node2b;
        balancedTree.right = node7b;
        node2b.left = node1b;
        node2b.right = node3b;
        node7b.left = node6b;
        node7b.right = node9b;

        unBalancedTree = new TreeNode(1);
        TreeNode node2u = new TreeNode(2);
        TreeNode node1u = new TreeNode(1);
        TreeNode node3u = new TreeNode(3);
        unBalancedTree.left = node2u;
        node2u.left = node1u;
        node2u.right = node3u;
    }

    @Test
    public void testIsBalancedTreeToBeTrue() throws Exception {
        assertTrue(algo.isBalanced(balancedTree));
    }

    @Test
    public void testIsBalancedTreeToBeFalse() throws Exception {
        assertFalse(algo.isBalanced(unBalancedTree));
    }
}
