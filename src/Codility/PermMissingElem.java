package Codility;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] A = {2,3,1,5,4,6,8};
        Integer result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length < 0 || A.length > 100000) {
            return 0;
        }
        int missing = 0;

        int j = 0;
        Arrays.sort(A);
        int currNumber = A[0];
        // gets the missing number of a number sequence in an array
        while (currNumber < A.length+1) {
            if (A[j] < 1 || A[j] > A.length+1) return 0;

            if (currNumber != A[j]) {
                missing = currNumber;
            }
            currNumber++;
            j++;
        }

        return missing;

    }
}
