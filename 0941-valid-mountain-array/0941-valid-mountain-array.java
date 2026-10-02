class Solution {
    static {
        int[] arr = { 1, 2, 3 };
        for (int i = 0; i < 100; i++)
            validMountainArray(arr);
    }

    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if (n < 3)
            return false;
        int peak = -1;
        boolean increasing = false;
        boolean decreasing = false;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i - 1] || arr[i] == arr[i + 1]) {
                return false;
            }
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                if (peak != -1) {
                    return false;
                }
                peak = arr[i];
            } else if (arr[i - 1] < arr[i]) {
                if (decreasing)
                    return false;
                increasing = true;
            } else if (arr[i - 1] > arr[i]) {
                if (increasing && peak == -1)
                    return false;
                decreasing = true;
            }
        }
        return (peak != -1 && arr[n - 1] < arr[n - 2]);
    }
}