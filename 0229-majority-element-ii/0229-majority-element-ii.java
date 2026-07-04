class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0, el1=0;
        int count2=0, el2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && nums[i]!=el2){
                count1=1;
                el1=nums[i];
            }
            else if(count2==0 && nums[i]!=el1){
                count2=1;
                el2=nums[i];
            }
            else if(el1==nums[i]){
                count1++;
            }
            else if(el2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> result=new ArrayList<>();
        int div=nums.length/3;
        count1=0;
        count2=0;
        for (int i = 0; i < nums.length; i++) {
            if (el1 == nums[i]) {
                count1++;
            } else if (el2 == nums[i]) {
                count2++;
            }
        }
        if(count1>div){
            result.add(el1);
        }
        if(count2>div){
            result.add(el2);
        }
        return result;
    }
}