package tree.symmetrictree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by haozhexu on 1/17/16.
 */
public class IsSymmetricTreeTest {

    private IsSymmetricTree algo;
    private TreeNode root;
    @Before
    public void setUp() throws Exception {
        root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        TreeNode leftOfleft = new TreeNode(3);
        TreeNode rightOfright = new TreeNode(3);
        left.left = leftOfleft;
        right.right = rightOfright;
        algo = new IsSymmetricTree();
    }

    @Test
    public void testIsSymmetricTree() throws Exception {

    }

}
