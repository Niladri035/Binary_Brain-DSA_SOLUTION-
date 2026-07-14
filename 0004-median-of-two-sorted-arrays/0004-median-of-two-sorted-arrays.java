import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int a = nums1.length;
        int b = nums2.length;

        int[] A = new int[a + b];

        System.arraycopy(nums1, 0, A, 0, a);
        System.arraycopy(nums2, 0, A, a, b);

        Arrays.sort(A);

        int n = A.length;

        if (n % 2 == 1) {
            return A[n / 2];
        }

        return (A[n / 2] + A[n / 2 - 1]) / 2.0;
    }
}