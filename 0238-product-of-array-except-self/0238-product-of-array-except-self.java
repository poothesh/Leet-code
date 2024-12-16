class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int temp = 1;
        for(int i = 0;i<nums.length;i++){
            
            temp *= nums[i];
            arr[i] = temp;
        }
        return arr;
    }
}