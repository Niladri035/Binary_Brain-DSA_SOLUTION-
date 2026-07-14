import java.util.*;

class Solution {

    private static final int MOD = 1_000_000_007;
    private Integer[][][] dp;

    public int subsequencePairCount(int[] nums) {

        int n = nums.length;

        int max = 0;
        for (int x : nums) {
            max = Math.max(max, x);
        }

        dp = new Integer[n + 1][max + 1][max + 1];

        return dfs(0, 0, 0, nums);
    }

    private int dfs(int index, int gcdA, int gcdB, int[] nums) {

        if (index == nums.length) {
            return (gcdA != 0 && gcdA == gcdB) ? 1 : 0;
        }

        if (dp[index][gcdA][gcdB] != null) {
            return dp[index][gcdA][gcdB];
        }

        long ans = 0;

        // Put current element into A
        ans += dfs(index + 1,
                gcd(gcdA, nums[index]),
                gcdB,
                nums);

        // Put current element into B
        ans += dfs(index + 1,
                gcdA,
                gcd(gcdB, nums[index]),
                nums);

        // Skip current element
        ans += dfs(index + 1,
                gcdA,
                gcdB,
                nums);

        dp[index][gcdA][gcdB] = (int) (ans % MOD);

        return dp[index][gcdA][gcdB];
    }

    private int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}