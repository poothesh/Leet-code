class Solution {
    public class Pair {
        int i ; 
        int j ;

        Pair(int i , int j){
            this.i=i ;
            this.j = j ; 
        }
    }
    public int longestIncreasingPath(int[][] matrix) {
        int[][] indegree = new int[matrix.length][matrix[0].length] ;
        int[][] dir = {{0,1} , {1,0} , {0,-1} , {-1,0}} ; 
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                for(int d = 0 ; d < dir.length ; d++){
                    int nr = i + dir[d][0] ;
                    int nc = j + dir[d][1] ;
                    if(nr >= 0 && nc >= 0 && nr < matrix.length && nc < matrix[0].length && matrix[nr][nc] < matrix[i][j] ){
                        indegree[i][j]++ ;
                    }
                }
            }
        }

    LinkedList<Pair> que = new LinkedList<>() ;
    for(int i = 0 ; i < matrix.length ; i++){
        for(int j = 0 ; j < matrix[0].length ; j++){
            if(indegree[i][j] == 0){
                que.add(new Pair(i,j)) ;
            }
        }
    }


    int level = 0 ; 

    while(que.size() != 0 ){
        int size = que.size() ; 
        while(size > 0){
            Pair p = que.remove() ; 
            int sr = p.i ; 
            int sc = p.j ; 

            for(int d = 0 ;d < dir.length ; d++){
                int nr = sr + dir[d][0] ;
                int nc = sc + dir[d][1] ; 
                if(nr >= 0 && nc >= 0 && nr < matrix.length && nc < matrix[0].length && matrix[nr][nc] > matrix[sr][sc]){
                    indegree[nr][nc]-- ; 
                    if(indegree[nr][nc] == 0){
                        que.add(new Pair(nr , nc)) ; 
                    }
                }
            }

            size-- ; 
        }
        level++ ;
    }

return level ; 








    }
}