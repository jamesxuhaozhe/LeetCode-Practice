package tree.invertbinarytree;

import datastructure.TreeNode;

/**
 * Created by haozhexu on 1/17/16.
 */
public class InvertBinaryTree {
    public TreeNode invertBinaryTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode tempNode = root.left;
        root.left = root.right;
        root.right = tempNode;
        if (root.left != null) {
            invertBinaryTree(root.left);
        }
        if (root.right != null) {
            invertBinaryTree(root.right);
        }
        return root;
    }
}
