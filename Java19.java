// Write a Java method to compute the average of three numbers.

import java.util.Scanner;

public class Java19 {
    public static float avg(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = sc.nextInt();
        System.out.println(avg(num1, num2, num3));
        sc.close();
    }
}
