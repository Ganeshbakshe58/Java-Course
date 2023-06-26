// Write a Java Program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;

public class Java9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        float n = sc.nextFloat();
        if(n > 0)
            System.out.println("Number is Positive");
        else if(n < 0) 
            System.out.println("Number is Negative");
        else
            System.out.println("Number is Zero");
        sc.close();
    }
}
