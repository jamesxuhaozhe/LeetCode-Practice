package tree.binarytreezigzagleveltraversal;

import datastructure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by haozhexu on 1/21/16.
 */
public class BinaryTreeZigZagLevelTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isOdd = true;
        while (!queue.isEmpty()) {
            int levelNodeSize = queue.size();
            List<Integer> levelVals = new ArrayList<>();
            for (int i = 0; i < levelNodeSize; i++) {
                if (queue.peek().left != null) {
                    queue.offer(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.offer(queue.peek().right);
                }
                if (isOdd == true) {
                    levelVals.add(queue.poll().val);
                } else {
                    levelVals.add(0, queue.poll().val);
                }
            }
            result.add(levelVals);
            isOdd = !isOdd;
        }
        return result;
    }
}
