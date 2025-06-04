class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int  p =0 , ng = 0;
        int[] pos = new int[n/2];
        int[] neg = new int[n/2];
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                pos[p] = nums[i];
                p++;
            }else{
                neg[ng] = nums[i];
                ng++;
            }
        }
        p=ng=0;

        for(int i=0;i<n;i++){
            if(i%2==0){
                nums[i] = pos[p];
                p++;         
            }else{
                nums[i] = neg[ng];
                ng++;
            }
        }
        return nums;

    }
}