class Solution {
    int ans=1_000_01;
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int k[]:roads) {
            adj.get(k[0]).add(new int[]{k[1],k[2]});
            adj.get(k[1]).add(new int[]{k[0],k[2]});
        }
        return bfs(adj,n);
    }
    int bfs(List<List<int[]>> g,int n){
        boolean vis[] = new boolean[n+1];
        vis[1]=true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        while(!q.isEmpty()){
            int pre=q.poll();
            vis[pre]=true;
            for(int[] l: g.get(pre)){
                ans=Math.min(ans,l[1]);
                if(!vis[l[0]]) q.offer(l[0]);
            }
        }return ans;
    }
}