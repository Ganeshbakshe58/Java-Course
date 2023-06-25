
// In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.
// (Hint: Average of N numbers is sum of those numbers divided by N)

import java.util.*;
public class Java1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1sr Number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int c = sc.nextInt();
        int avg = (a + b + c) / 3;
        System.out.println("Average of " + a + ", " + b + " & " + c + " is : " + avg);
        sc.close();
    }
}

