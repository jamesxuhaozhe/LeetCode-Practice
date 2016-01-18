package tree.validatebinarysearchtree;

import datastructure.TreeNode;

/**
 * Created by haozhexu on 1/18/16.
 */
public class ValidateBinarySearchTree {

    class ResultType {
        boolean isBST;
        int maxValue;
        int minValue;
        ResultType(boolean is_bst, int max, int min) {
            isBST = is_bst;
            maxValue = max;
            minValue = min;
        }
    }

    public boolean isValidBST(TreeNode root) {
        ResultType result = helper(root);
        return result.isBST;
    }

    private ResultType helper(TreeNode root) {
        if (root == null) {
            return new ResultType(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        ResultType leftRes = helper(root.left);
        ResultType rightRes = helper(root.right);
        if (!leftRes.isBST || !rightRes.isBST) {
            return new ResultType(false, 0, 0);
        }
        if (root.left != null && leftRes.maxValue >= root.val) {
            return new ResultType(false, 0, 0);
        }
        if (root.right != null && rightRes.minValue <= root.val) {
            return new ResultType(false, 0, 0);
        }
        return new ResultType(true, Math.max(root.val, rightRes.maxValue), Math.min(root.val, leftRes.minValue));
    }
}
