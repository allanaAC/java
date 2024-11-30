package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
                if (nums == null || nums.length == 0) {
                    return 0;
                }

                // If the array has 2 or fewer elements, no need to modify it
                if (nums.length <= 2) {
                    return nums.length;
                }

                // Initialize the pointer for the position to place the next element
                int k = 2;

                // Start from the third element
                for (int i = 2; i < nums.length; i++) {
                    // If the current element is different from the element two positions back,
                    // it's safe to keep it
                    if (nums[i] != nums[k - 2]) {
                        nums[k] = nums[i];
                        k++;
                    }
                }

                return k;



    }
    public static void main(String[] args) {
        //int[] arr = {1,1,1,2,2,3};
        int[] arr = {0,0,1,1,1,1,2,3,3};
        RemoveDuplicate rem = new RemoveDuplicate();
        int res = rem.removeDuplicates(arr);
        System.out.println("res: " + res);
    }

}
