class Solution {
    public List<Integer> spiralOrder(int[][] nums) {
        int n = nums.length;
        int m = nums[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        List<Integer> list = new ArrayList<>();
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(nums[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(nums[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(nums[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom ; i >= top ; i-- ){
                    list.add(nums[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}