import java.util.*;
public class BinomialCoefficient {
    public static long factorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++)
            factorial *= i;
        return factorial;
    }
    public static long binomial(int n, int r) {
        long fn = factorial(n);
        long fr = factorial(r);
        long fnr = factorial(n - r);
        long binomial = fn / (fr * fnr);
        return binomial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.println(n + "C" + r + ": " + binomial(n, r));
        sc.close();
    }
}