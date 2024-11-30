package Codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //A[0] = 9 A[1] = 3 A[2] = 9 A[3] = 3 A[4] = 9 A[5] = 7 A[6] = 9

        int[] A = { 9, 3, 9, 3, 9, 7, 9 };
        int result = Solution(A);
        System.out.println(result);
    }

    public static int Solution(int[] A) {

        if(A.length > 1000000000) return 0;

        int result = 0;
        HashMap<Integer, Boolean> mapping = new HashMap<Integer, Boolean>();
        for (int i = 0; i < A.length; i++) {
            if(A[i] < 1 || A[i] > 1000000) {
                return 0;
            }
            if(mapping.containsKey(A[i])) {
                //mapping.get(A[i]);
                mapping.put(A[i], true);
            } else {
                mapping.put(A[i], false);
            }
        }
        for (Map.Entry<Integer, Boolean> entry : mapping.entrySet()) {
            if (entry.getValue() == false) {
                result = entry.getKey();
            }
        }
        return result;
    }
}
