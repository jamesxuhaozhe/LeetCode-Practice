package tree.sametree;

import datastructure.TreeNode;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by haozhexu on 1/17/16.
 */
public class IsSameTreeTest {

    private IsSameTree algo;
    private TreeNode tree1;
    private TreeNode tree2;

    @Before
    public void setUp() throws Exception {
        algo = new IsSameTree();
        tree1 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(3);
        tree1.left = node1;
        tree1.right = node2;

        tree2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(3);
        tree2.left = node3;
        tree2.right = node4;
    }
    @Test
    public void testIsSameTreeToBeTrue() throws Exception {
        assertTrue(algo.isSameTree(tree1, tree2));
    }

    @Test
    public void testIsSameTreeToBeFalse() throws Exception {
        assertFalse(algo.isSameTree(tree1, tree2.right = new TreeNode(6)));
    }
}
