class Solution {
    public int finalValueAfterOperations(String[] o) {
        int sum=0;
        for(int i=0;i<o.length;i++){
            if(o[i].charAt(1)=='+') sum++;
            else sum--;
        }
        return sum;
    }
}