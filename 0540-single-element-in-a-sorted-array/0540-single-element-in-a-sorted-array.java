import java.util.HashMap;

class Solution {
    public int singleNonDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the element with frequency 1
        for (int num : nums) {
            if (map.get(num) == 1) {
                return num;
            }
        }

        return -1;
    }
}