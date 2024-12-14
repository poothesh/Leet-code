class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return findWays(nums, target, 0, 0); // Start recursion
    }

    private int findWays(int[] nums, int target, int index, int currentSum) {
        // Base case: If we have processed all elements
        if (index == nums.length) {
            return currentSum == target ? 1 : 0; // Count as a valid way
        }
        
        // Explore both possibilities: adding and subtracting the current element
        int add = findWays(nums, target, index + 1, currentSum + nums[index]);
        int subtract = findWays(nums, target, index + 1, currentSum - nums[index]);
        
        return add + subtract; // Total ways for the current index
    }
}
