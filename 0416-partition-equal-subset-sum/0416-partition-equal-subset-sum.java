class Solution {
    public boolean canPartition(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        // If the total sum is odd, it's not possible to partition it into two equal subsets
        if (sum % 2 != 0) {
            return false;
        }
        
        int target = sum / 2;
        boolean[][] dp = new boolean[arr.length + 1][target + 1];
        
        // Initialize the dp array
        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = true;
        }
        
        for (int i = 1; i <= arr.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (j >= arr[i - 1]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        
        return dp[arr.length][target];
    }
}
