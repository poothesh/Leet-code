class Solution {
    public boolean ispal(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    
    
    public int rec(String s,int i,String ans){
        if(i==s.length()) return ispal(ans) ? ans.length() : 0;
        
        char c=s.charAt(i);
        return Math.max(rec(s,i+1,ans+c),rec(s,i+1,ans));
    }
    public int rec2(String s,int i,int j){
        if(i==j) return 1;
        if(i>j) return 0;
        
        char c=s.charAt(i);
        char cc=s.charAt(j);
        if(c==cc){
            return rec2(s,i+1,j-1)+2;
        }else{
            return Math.max(rec2(s,i+1,j),rec2(s,i,j-1));
        }
    }
    
    public int rec_memo(String s,int i,int j,int[][] memo){
        
        if(i==j) return memo[i][j]=1;
        if(i>j) return memo[i][j]=0;
        if(memo[i][j]!=0) return memo[i][j];
        
        char c=s.charAt(i);
        char cc=s.charAt(j);
        if(c==cc){
            return memo[i][j]=rec_memo(s,i+1,j-1,memo)+2;
        }else{
            return memo[i][j]=Math.max(rec_memo(s,i+1,j,memo),rec_memo(s,i,j-1,memo));
        }
    }
    
    public int longestPalindromeSubseq(String s) {
        int[][] dp=new int[s.length()][s.length()];
        return rec_memo(s,0,s.length()-1,dp);
    }
}