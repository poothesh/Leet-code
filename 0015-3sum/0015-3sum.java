import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> sumArr = new ArrayList<>();
        Arrays.sort(nums); // Sorting the array

        // Loop to fix the first element (nums[i])
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Loop for the second element (nums[j])
            for (int j = i + 1; j < nums.length - 1; j++) {
                // Skip duplicates for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                // Loop for the third element (nums[k])
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        sumArr.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }

        // Remove duplicates by using a Set
        Set<List<Integer>> uniqueSumArr = new HashSet<>(sumArr);
        sumArr.clear();
        sumArr.addAll(uniqueSumArr);

        return sumArr;
    }
}
