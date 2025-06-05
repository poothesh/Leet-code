class Solution {
    public static void column(int i,int m,int[][] nums){
        for(int j=0;j<m;j++){
            if(nums[i][j]!=0){
                nums[i][j] = -1037;
            }
        }
    }
    public static void row(int j,int n,int[][] nums){
        for(int i=0;i<n;i++){
            if(nums[i][j]!=0){
                nums[i][j] = -1037;
            }
        }
    }
    public void setZeroes(int[][] nums) {
        int m = nums[0].length;
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    column(i, m, nums);
                    row(j,n,nums);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==-1037){
                    nums[i][j]=0;
                }
            }
        }
    }
}