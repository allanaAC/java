package Codility;

import java.util.*;

public class Test2 {
    public static void  funcTwins(int[] inputArr)
    {
        // Write your code here
        List<Integer> listI = new ArrayList<>();
        for (int x: inputArr) {
            listI.add(x);
        }
        int cnt = 0;
        int notTwin = 0;
        Iterator<Integer> iterator = listI.iterator();
        for(int i=0; i < inputArr.length; i++) {
            cnt=0;
            for(int j=0; j < inputArr.length; j++) {
                if(inputArr[i] == inputArr[j]) {
                    cnt++;
                    if(cnt > 1) {
                        while (iterator.hasNext()) {
                            int element = iterator.next();
                            if (element == inputArr[i]) {
                                iterator.remove();
                            }
                        }
                    }
                }

            }
        }
        System.out.println(listI);


    }

    public static void main(String[] args)
    {
        //Scanner in = new Scanner(System.in);
        //input for inputArr
        int inputArr[] = {1,1,2,2,3,3,4,4,5};

        funcTwins(inputArr);

        byte a = 127;
        System.out.println(a);
    }
}
