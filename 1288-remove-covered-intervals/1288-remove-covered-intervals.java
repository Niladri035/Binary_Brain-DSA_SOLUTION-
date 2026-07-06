class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // sort by start point in ascending order, and by end point in
        // descending order when start points are the same
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        });

        // record the start and end of the merged interval
        int left = intervals[0][0];
        int right = intervals[0][1];

        int res = 0;
        for (int i = 1; i < intervals.length; i++) {
            int[] intv = intervals[i];
            // case 1: found a covered interval
            if (left <= intv[0] && right >= intv[1]) {
                res++;
            }
            // case 2: found an overlapping interval, merge them
            if (right >= intv[0] && right <= intv[1]) {
                right = intv[1];
            }
            // case 3: no overlap at all, update the start and end points
            if (right < intv[0]) {
                left = intv[0];
                right = intv[1];
            }
        }

        return intervals.length - res;
    }
}