// Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.

import java.util.Scanner;

public class Java10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();

        if (temperature < 100)
        System.out.println("You Don't Have a fever");
        else
            System.out.println("You have Fever!!!");
            sc.close();
    }
}
