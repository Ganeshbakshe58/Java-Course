// print 1-n using while loop

import java.util.Scanner;

public class Java13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        while (counter <= n){
            System.out.println(counter);
            counter++;

        sc.close();
        }
    }
}
