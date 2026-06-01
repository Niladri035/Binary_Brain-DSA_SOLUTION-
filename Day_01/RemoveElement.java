public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int writeIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[writeIndex] = nums[i];
                writeIndex++;
            }

        }

        return writeIndex;
    }

    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};

        int k = removeElement(nums, 3);

        System.out.println("New Length: " + k);

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}