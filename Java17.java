// Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

import java.util.*;
public class Java17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        char choice = 'y';
        while(choice == 'y') {
            System.out.print("Enter Number: ");
            int n = sc.nextInt();
            if(n % 2 == 0)
                evenSum += n;
            else
                oddSum += n;
            System.out.print("Do you want to continue[y/n]: ");
            choice = sc.next().charAt(0);
        }
        System.out.println("Sum Of Even Numbers: " + evenSum);
        System.out.println("Sum Of Odd Numbers: " + oddSum);
        sc.close();
    }
}
