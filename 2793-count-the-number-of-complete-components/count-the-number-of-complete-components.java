class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[]e:edges){
            int u=e[0];
            int v=e[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        int ans=0;
        boolean[]vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                List<Integer> component=new ArrayList<>();

                bfs(vis,component,adj,i);
                boolean complete=true;

                for(int it:component){
                    if(adj.get(it).size()!=component.size()-1){
                        complete=false;
                        break;
                    }
                }
                if(complete)ans++;
            }
        }
        return ans;
    }
    public void bfs(boolean[]vis,List<Integer>li,List<List<Integer>>adj,int node){
        vis[node]=true;
        Queue<Integer>q=new LinkedList<>();
        q.add(node);

        while(!q.isEmpty()){
            int curr=q.poll();
            li.add(curr);

            for(int it:adj.get(curr)){
                if(!vis[it]){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
    }
}