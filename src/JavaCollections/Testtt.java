import java.util.*;
import java.lang.*;
import java.io.*;

/*
 * inputSting, represents the given string.
 */
public class Testtt
{
    public static int  funcAlphabeticOrder(String inputSting)
    {
        int  answer =-1;
        // Write your code here
        int found = 0;
        char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char [] str = inputSting.toCharArray();
        System.out.println(str);
        for (int i = 0; i < str.length; i++) {
            if (str[i] != alphabet[i]) {
                System.out.println("Elements at index " + i + " are different");
                answer = i;
            } else {
                answer = 0;
            }
        }
        //answer = found;
        //System.out.println(found);

        return answer;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // input for inputSting
        String inputSting = "absc";

        int result = funcAlphabeticOrder(inputSting);
        System.out.println(result);
        int x=12;
        System.out.println(x=x==10?x*2:x*3);
        //x=x==10;

    }
}