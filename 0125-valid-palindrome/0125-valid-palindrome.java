class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
