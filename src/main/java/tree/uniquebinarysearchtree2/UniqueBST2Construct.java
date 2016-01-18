package tree.uniquebinarysearchtree2;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozhexu on 1/19/16.
 */
public class UniqueBST2Construct {
    public List<TreeNode> constructUniqueBST(int n) {
        return n == 0 ? new ArrayList<TreeNode>() : helper(1, n);
    }

    private List<TreeNode> helper(int start, int end) {
        List<TreeNode> result = new ArrayList<>();
        if (start > end) {
            result.add(null);
            return result;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTrees = helper(start, i - 1);
            List<TreeNode> rightTrees = helper(i + 1, end);
            for (TreeNode leftTree : leftTrees) {
                for (TreeNode rightTree : rightTrees) {
                    TreeNode root = new TreeNode(i);
                    root.left = leftTree;
                    root.right = rightTree;
                    result.add(root);
                }
            }
        }
        return result;
    }
}
