package Codility;

import java.util.*;
import java.lang.*;

public class BinaryGap {

    public static int solution(int N) {
        // TODO Auto-generated method stub
        int maxlen = 0;
        if(N >= 1 && N <= 2147438647) {


            String bin = Integer.toBinaryString(N);
            int len = bin.length();
            boolean start = false, end = false, loop = true;
            int count = 0;
            ArrayList<Integer> zeroes = new ArrayList<>();

            for (int i = 0; i < len; i++) {
                if (bin.charAt(i) == '1') {
                    zeroes.add(count);
                    count = 0;
                    continue;
                }

                if (bin.charAt(i) == '0') {
                    count++;
                }
            }

            maxlen = Collections.max(zeroes);

        }
        return maxlen;
    }

    public static void main(String[] args) {
        int i = 1041;//289 1041
        System.out.println(solution(i));

        int[] arr = {10, 324, 45, 90, 9808};
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("Largest element: " + max);
    }
}