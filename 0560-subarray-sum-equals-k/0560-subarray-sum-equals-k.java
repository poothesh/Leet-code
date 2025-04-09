class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum =0;
        int idx=0;
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            if(prefixSum==k){
                idx=i;
            }
        }
        return idx+1;
    }
}