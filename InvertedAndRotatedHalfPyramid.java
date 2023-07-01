import java.util.Scanner;

public class InvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number Of Rows: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            for(int j = i - n; j <= 0; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }

    
}
