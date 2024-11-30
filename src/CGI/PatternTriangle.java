package CGI;

import java.util.ArrayList;
import java.util.List;

public class PatternTriangle {

        public static void pattern(int n)
        {
            int size = n * (n + 1);

            // prev1 will be used to keep track of last number
            // printed in left half of pattern
            int prev1 = 0;

            // prev2 will be used to keep track of last number
            // printed in right half of pattern
            int prev2 = size;
            for (int i = 0; i < n; i++) {

                // print the '-'
                for (int j = 0; j < 2 * i; j++)
                    System.out.print("-");

                // l1 to store numbers of left half to be
                // printed
                List<Integer> l1 = new ArrayList<>();
                for (int j = prev1 + 1; j <= prev1 + n - i; j++)
                    l1.add(j);

                // l2 to store numbers of right half to be
                // printed
                List<Integer> l2 = new ArrayList<>();
                for (int j = prev2 - (n - i) + 1; j <= prev2;
                     j++)
                    l2.add(j);

                // combine l1 and l2 and print the list
                // separated by *
                for (int j = 0; j < l1.size(); j++)
                    System.out.print(l1.get(j) + "*");
                for (int j = 0; j < l2.size(); j++)
                    if (j==l2.size()-1)
                        System.out.print(l2.get(j));
                    else
                        System.out.print(l2.get(j) + "*");
                System.out.println();

                // decrease prev2 and increase prev1
                prev2 -= (n - i);
                prev1 += (n - i);
            }
        }

        public static void main(String[] args)
        {
            int n = 3;
            pattern(n);
        }

}
