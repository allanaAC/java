package Codility;

import java.util.HashMap;
import java.util.Map;

public class FrogImp {
    public static void main(String[] args) {
        int X = 10; //10
        int Y = 85;
        int D = 30;
        Integer result = solution(X,Y,D);
        System.out.println(result);
    }

    public static int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        if (X < 1 || X > 1000000000) return 0;
        if (Y < 1 || Y > 1000000000) return 0;
        if (D < 1 || D > 1000000000) return 0;
        if (X > Y) return 0;

        int jumps = 0;
        int jump_count = 0;
        Y = Y + 10;
        jump_count = Y / D;

        if (jump_count >= Y)
            jumps = jump_count;
        else
            jumps = jump_count;

        return jumps;
    }
}
