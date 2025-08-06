class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        int min = nums[0];

        for(int i=0;i<nums.length;i++){
            int cost = nums[i] - min;
            profit = Math.max(cost,profit);
            min = Math.min(min,nums[i]);
        }
        return profit;
    }
}