import java.util.*;

public class Palindrome {
    public static String isPalindrome(int n) {
        int cn = n;
        int rn = 0;
        while(cn > 0) {
            int ld = cn % 10;
            rn = rn * 10 + ld;
            cn = cn / 10;
        }
        if(rn == n)
            return "Palindrome Number";
        else
            return "Non-Palindrome Number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}