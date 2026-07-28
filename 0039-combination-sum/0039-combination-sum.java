class Solution {
    public void solve(int i,int t,int [] arr, List<Integer> ds , List<List<Integer>> ans ){

        if(i == arr.length){
            if(t == 0 ){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if(arr[i] <= t) {
            ds.add(arr[i]);
            solve(i,t-arr[i],arr,ds,ans);
            ds.remove(ds.size()-1);
        }

        solve(i+1,t,arr,ds,ans);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        solve(0,target,candidates,ds,ans);


        return ans;
    }
}