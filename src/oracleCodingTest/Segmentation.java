package oracleCodingTest;


import java.util.HashSet;
import java.util.Set;

    class StringSegmentation {

        public static boolean canSegmentString(String s, Set<String> dictionary) {
            int n = s.length();
            boolean[] dp = new boolean[n + 1];
            dp[0] = true;  // Empty string can be segmented

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && dictionary.contains(s.substring(j, i))) {
                        dp[i] = true;
                        break;
                    }
                }
            }

            return dp[n];
        }

        public static void main(String[] args) {
            Set<String> dictionary = new HashSet<>();
            String s = "hellonow";

            dictionary.add("hello");
            dictionary.add("hell");
            dictionary.add("on");
            dictionary.add("now");
            if (canSegmentString(s, dictionary)) {
                System.out.println("String Can be Segmented");
            } else {
                System.out.println("String Can NOT be Segmented");
            }
        }
    }

