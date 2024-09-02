package Codility;

public class TapeEquilibrium {
    public static void main(String[] args) {
        int[] A = {3,1,2,4,3};
        Integer result = solution(A);
        System.out.println(result);
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length < 2 || A.length > 100000) {
            return 0;
        }
        int total = 0;
        int min = Integer.MAX_VALUE;
        int leftSum = 0;
        for(int i: A) {
            total += i;
        }

        for(int j=0; j < A.length-1; j++) {
            if (A[j] < -1000 || A[j] > 1000) {
                return 0;
            }
            leftSum += A[j];
            int rightSum = total - leftSum;
            int diff = Math.abs(leftSum - rightSum);
            min = Math.min(min, diff);
        }
        return min;
    }
}
