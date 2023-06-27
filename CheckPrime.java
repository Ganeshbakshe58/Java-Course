// Check if a number is prime or not

import java.util.*;
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        String check = "Prime Number";
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                check = "Non-Prime Number";
                break;
            }
        }
        System.out.println(check);
        sc.close();
    }
}
