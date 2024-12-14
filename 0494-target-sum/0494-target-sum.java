class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totalWays = 0;
        int totalCombinations = 1 << n; // Total 2^n combinations
        
        for (int mask = 0; mask < totalCombinations; mask++) {
            int sum = 0;
            
            // Generate the sum for this combination
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += nums[i]; // Add current number
                } else {
                    sum -= nums[i]; // Subtract current number
                }
            }
            
            // Check if the sum matches the target
            if (sum == target) {
                totalWays++;
            }
        }
        
        return totalWays;
    }
}
