import java.util.Arrays;

public class FindMaxMin {

    public static int[] findMaxMin(int[] myList) {
        if(myList==null || myList.length == 0){
            return new int []{};
        }
        int max=myList[0];
        int min = myList[0];
        for(int i=1;i<myList.length;i++){
            if(myList[i]>max){
                max=myList[i];
            }
            if(myList[i]<min){
                min=myList[i];
            }
        }
        return new int[]{min, max};
        }
    


    // ── TEST ──────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMaxMin(new int[]{5, 3, 8, 1, 6, 9})));
        // Expected: [9, 1]

        System.out.println(Arrays.toString(findMaxMin(new int[]{-5, -1, -10, 0})));
        // Expected: [0, -10]

        System.out.println(Arrays.toString(findMaxMin(new int[]{42})));
        // Expected: [42, 42]
    }
}