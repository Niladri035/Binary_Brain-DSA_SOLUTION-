import java.util.*;

class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        backtrack(candidates, target, 0, new ArrayList<>());

        return ans;
    }

    private void backtrack(int[] arr,
                           int target,
                           int index,
                           List<Integer> current) {

        // Combination found
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Invalid case
        if (target < 0 || index == arr.length) {
            return;
        }

        // Take current number
        current.add(arr[index]);
        backtrack(arr, target - arr[index], index, current);

        // Undo choice (Backtrack)
        current.remove(current.size() - 1);

        // Skip current number
        backtrack(arr, target, index + 1, current);
    }
}