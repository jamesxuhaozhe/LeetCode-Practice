package tree.sumroottoleafnums;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haozhexu on 1/19/16.
 */
public class SumRootToLeafNums {
    public int getNums(TreeNode root) {
        List<Integer> result = getList(root);
        int sum = 0;
        for (Integer i : result) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }

    private List<Integer> getList(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            result.add(0);
            return result;
        }
        if (root.left == null && root.right == null) {
            result.add(root.val);
            return result;
        }
        if (root.left != null) {
            doWork(root.left, root.val, result);
        }
        if (root.right != null) {
            doWork(root.right, root.val, result);
        }
        return result;
    }

    private void doWork(TreeNode node, int current, List<Integer> result) {
        current = Integer.parseInt(Integer.toString(current) + Integer.toString(node.val));
        if (node.left == null && node.right == null) {
            result.add(current);
        }
        if (node.left != null) {
            doWork(node.left, current, result);
        }
        if (node.right != null) {
            doWork(node.right, current, result);
        }
    }
}
