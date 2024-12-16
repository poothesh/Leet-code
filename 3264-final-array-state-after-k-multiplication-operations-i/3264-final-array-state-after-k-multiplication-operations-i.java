class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        while(k-->0){
            int min = 0;
            for(int i=1;i<nums.length;i++){
                if(nums[i] < nums[min]){
                    min =i;
                }
            }
            nums[min]*=multiplier;
        }    
        return nums;
    }
}