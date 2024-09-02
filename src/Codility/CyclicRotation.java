package Codility;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] A = { 5, 6, 7, 8, 4, 2, 7, 1 };
        int K = 2;
        int[] result = Solution(A, K);
        System.out.println(Arrays.toString(result));
    }

    public static int[] Solution(int[] A, int K) {

        for(int i=0; i<K; i++ ) {
            int lastElement = A[A.length-1];
            for(int j=A.length-1; j>0; j--) {
                //System.out.println(j +":"+ A[j]);
                A[j] = A[j-1];
            }
            A[0] = lastElement;
        }

        return A;

    }
}
