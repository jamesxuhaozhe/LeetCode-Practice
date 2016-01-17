package tree.symmetrictree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by haozhexu on 1/17/16.
 */
public class IsSymmetricTreeTest {

    private IsSymmetricTree algo;
    private TreeNode symRoot;
    private TreeNode unSymRoot;

    @Before
    public void setUp() throws Exception {
        symRoot = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        symRoot.left = left;
        symRoot.right = right;
        TreeNode leftOfleft = new TreeNode(3);
        TreeNode rightOfright = new TreeNode(3);
        left.left = leftOfleft;
        right.right = rightOfright;

        unSymRoot = new TreeNode(3);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        unSymRoot.left = node1;
        unSymRoot.right = node2;

        algo = new IsSymmetricTree();
    }

    @Test
    public void testIsSymmetricTreeToBeTrue() throws Exception {
        assertTrue(algo.isSymmetricTree(symRoot));
    }

    @Test
    public void testIsSymmetricTreeToBeFalse() throws Exception {
        assertFalse(algo.isSymmetricTree(unSymRoot));
    }

}
