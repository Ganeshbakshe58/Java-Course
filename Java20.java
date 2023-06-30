// Write a Java method to compute the sum of the digits in an integer. 

import java.util.*;
public class Java20 {
    public static int digitSum(int n) {
        int sum = 0;
        while(n > 0) {
            int ld = n % 10;
            sum += ld;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println(digitSum(n));
        sc.close();
    }
}
