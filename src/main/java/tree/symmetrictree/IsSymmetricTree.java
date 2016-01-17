package tree.symmetrictree;

import datastructure.TreeNode;

/**
 * Created by haozhexu on 1/17/16.
 */
public class IsSymmetricTree {

    public static void main(final String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        TreeNode leftOfleft = new TreeNode(3);
        TreeNode rightOfright = new TreeNode(3);
        left.left = leftOfleft;
        right.right = rightOfright;
        IsSymmetricTree algo = new IsSymmetricTree();
        System.out.println(algo.isSymmetricTree(root) ? "True" : "False");
    }

    public boolean isSymmetricTree(TreeNode root) {
        return root == null ? true : isSym(root.left, root.right);
    }

    private boolean isSym(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSym(left.left, right.right) && isSym(left.right, right.left);
    }

}
