import java.util.*;

public class PrimeInRange {
    public static String checkPrime(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return "Non-Prime Number";
        }
        return "Prime Number";
    }
    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if(checkPrime(i) == "Prime Number")
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth Term: ");
        int n = sc.nextInt();
        printPrime(n);
        sc.close();
    }
}


