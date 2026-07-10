class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = findMax(piles);

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = calculateHours(piles, mid);

            if (hours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private long calculateHours(int[] piles, int speed) {

        long hours = 0;

        for (int pile : piles) {

            hours += (pile + speed - 1) / speed;
        }

        return hours;
    }

    private int findMax(int[] piles) {

        int max = piles[0];

        for (int pile : piles) {
            max = Math.max(max, pile);
        }

        return max;
    }
}