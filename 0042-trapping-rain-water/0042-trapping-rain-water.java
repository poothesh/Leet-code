class Solution {
    public int trap(int[] height) {
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        int leftmaximum=0,rightmaximum=0;
        for(int i=0; i<left.length; i++)
        {
            left[i]=leftmaximum;
            leftmaximum=Math.max(height[i],leftmaximum);
        }
        for (int i=left.length-1; i>=0; i--)
        {
            right[i]=rightmaximum;
            rightmaximum=Math.max(height[i],rightmaximum);
        }
        int count=0;
        for(int i=0; i<height.length; i++)
        {
            int min=Math.min(left[i],right[i]);
            if(min>height[i])
            {
                count+=(min-height[i]);
            }
        }
        return count;
    }
}