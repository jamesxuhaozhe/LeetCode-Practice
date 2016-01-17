package tree.maxdepthofbinarytree;

import datastructure.TreeNode;

/**
 * Created by haozhexu on 1/17/16.
 */
public class MaxDepthOfBinaryTree {
    public int getMaxDepth(TreeNode root) {
        return root == null ? 0 : getMax(root);
    }

    private int getMax(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return Math.max(getMax(node.right), getMax(node.left)) + 1;
    }
}
