class Solution {
    public void dfs(ArrayList<Integer>[] graph , int src , int dest , 
    boolean[] vis ,  List<Integer> curr , List<List<Integer>> res
    ) {

        if(src == dest) {
            curr.add(dest) ; 
            ArrayList<Integer> list = new ArrayList<>(curr) ; 
            res.add(list) ; 
            return ; 
        }
        vis[src] = true ; 
        curr.add(src) ; 
        for(int nbr : graph[src]){
            if(vis[nbr] == false ){
                dfs(graph , nbr , dest , vis , curr , res) ; 
                curr.remove(curr.size()-1) ;
            }
        }
        vis[src] = false ;
        return ; 
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] input) {
        ArrayList<Integer>[] graph = new ArrayList[input.length] ; 
        for(int i = 0 ; i < graph.length ; i++){
            graph[i] = new ArrayList<>() ; 
        }
        for(int i = 0 ; i < input.length ; i++){
            for(int j = 0 ; j < input[i].length ; j++){
                graph[i].add(input[i][j]) ;
            }
        }

        List<Integer> curr = new ArrayList<>() ; 
        List<List<Integer>> res = new ArrayList<>() ; 
        boolean[] vis = new boolean[input.length] ;
        dfs(graph , 0 , input.length-1 , vis , curr , res) ; 
        return res ; 
    }
}






