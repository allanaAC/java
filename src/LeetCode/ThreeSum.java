package LeetCode;

import java.util.Arrays;

public class ThreeSum {
    public static boolean threeSum(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);
        int n = nums.length;

        // Iterate through the array, fixing one element as the first number
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];

                if (currentSum == target) {
                    return true;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        //int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] nums = {-1,2,1,-4,5,-3}; // -4,-3,-1,1,2,5
        int target = -8;
        boolean result = threeSum(nums, target);
        System.out.println("Result: " + result);
    }
}

