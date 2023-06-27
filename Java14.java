// Sum to the Nth Number.

import java.util.Scanner;

public class Java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;    
            
            sc.close();
            
        }
        System.out.println("Sum of "+n+" is: " + sum );
        
    }
}
