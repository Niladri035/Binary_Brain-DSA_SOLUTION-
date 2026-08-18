class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
       
        int sum=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize>0 && truckSize-boxTypes[i][0]>=0){
                sum+=boxTypes[i][0]*boxTypes[i][1];
                truckSize-=boxTypes[i][0];
            }
            else if(truckSize>0 && truckSize-boxTypes[i][0]<0){
                while(truckSize>0){
                    sum+=boxTypes[i][1];
                    truckSize--;
                }
                return sum;
            }
            else{
                return sum;
            }
        }
        return sum;
    }
}