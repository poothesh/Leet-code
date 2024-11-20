class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    private int binarySearch(int[] nums, int target, int l, int h) {
        if (l > h) {
            return -1;
        }

        int mid = l + (h - l) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, h);
        } else {
            return binarySearch(nums, target, l, mid - 1);
        }
    }
}
