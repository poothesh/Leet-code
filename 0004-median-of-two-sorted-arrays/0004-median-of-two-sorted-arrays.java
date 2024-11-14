class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] ans = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                ans[k++] = nums1[i++];
            }else{
                 ans[k++] = nums2[j++];
            }
        }
        while(i < m){
            ans[k++] = nums1[i++];
        }
        while(j<n){
            ans[k++] = nums2[j++];
        }
        int tl = ans.length;
        if(tl%2==1){
            return ans[tl/2];
        }else{
            int center = tl/2;
            return (ans[center-1]+ans[center])/2.0;
        }
    }
}