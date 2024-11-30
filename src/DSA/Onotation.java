package DSA;

public class Onotation {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100000;
        for(int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        sum = n * (n+1) / 2;
        System.out.println("SumA: " + sum);

    }
}
