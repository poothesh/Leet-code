class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums,0,nums.length-1);
        return nums;
    }
    void MergeSort(int[] nums,int start,int end){

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        MergeSort(nums,start,mid);
        MergeSort(nums,mid+1,end);
        SortedArray(nums,start,mid,end);
    }
    void SortedArray(int[] nums,int start,int mid,int end){
        int i = start;
        int j = mid+1;
        int k =0 ;
        int[] temp = new int[end-start+1];
        while(i<=mid && j <=end){
            if(nums[i]<nums[j]){
                temp[k++]=nums[i++];
            }else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=end){
            temp[k++]=nums[j++];
        }
        for (k = 0; k < temp.length; k++) {
            nums[start + k] = temp[k];
        }
    }

}