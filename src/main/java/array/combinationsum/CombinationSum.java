package array.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by haozhexu on 2/5/16.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }
        int pos = 0;
        Arrays.sort(candidates);
        helper(result, list, candidates, target, pos);

        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int pos) {
        if (target == 0) {
            result.add(new ArrayList<>(list));
            return;
        }

        int prev = -1;
        for (int i = pos; i < candidates.length; i++) {
            if (candidates[i] > target) {
                break;
            }

            if (prev != -1 && prev == candidates[i]) {
                continue;
            }

            list.add(candidates[i]);
            helper(result, list, candidates, target - candidates[i], i);
            list.remove(list.size() - 1);
            prev = candidates[i];
        }
    }

    public static void main(final String[] args) {
        int[] candidates = new int[] {2, 3, 6, 7};
        int target = 7;
        System.out.println("fix bug");
        System.out.print(new CombinationSum().combinationSum(candidates, target));
    }
}
