class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0 , lastSmaller = Integer.MIN_VALUE ,longest = 0 ;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]-1 == lastSmaller){
                count++;
                lastSmaller = nums[i];
            }else if(nums[i] != lastSmaller){
                count = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
}