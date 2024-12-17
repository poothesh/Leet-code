class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0, ans = Integer.MAX_VALUE, i =0 , j=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>=target){
                int len = j - i + 1;
                if(len < ans){
                    ans = len;
                }
                sum = sum-nums[i];
                i++;
            }
            j++;
        }
        if(ans == Integer.MAX_VALUE ){
            return 0;
        }
        return ans;
    }
}