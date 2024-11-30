package LeetCode;

import java.util.*;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        int start = 0;
        //int end = s.length()-1;
        char[] strS = s.toCharArray(); // Convert string to character array
        int end = strS.length-1;

        while (start < end) {
            if(strS[start] != strS[end]) {
                return false;
            }
            start++;
            end--;
        }
            // Replace this placeholder return statement with your code
        return true;
    }
    public static void main(String[] args) {
        boolean b = isPalindrome("r a c e c a r");
        System.out.print(b);
    }
}
