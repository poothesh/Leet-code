class Solution {
    public  static int largest(int[][] nums , int m , int n){
        int max = 0;
        for(int i=m;i<m+3;i++){
            for(int j=n;j<n+3;j++){
                max  = Math.max(max , nums[i][j]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] nums) {
        int m;
        int n = m = nums.length;
        int[][] matrix = new int[n-2][n-2];

        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                matrix[i][j] = largest(nums,i,j);
            }
        }
        return matrix;
    }
}