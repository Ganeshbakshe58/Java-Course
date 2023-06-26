import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter Number 2: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter Function: ");
        int function = sc.next().charAt(0);
        switch(function) {
            case '+': System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); break;
            case '-': System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); break;
            case '*': System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); break;
            case '/': System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); break;
            case '%': System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); break;
            default: System.out.println("Function Unavailable");
        }
        sc.close();
    }
}