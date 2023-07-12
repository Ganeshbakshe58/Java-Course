import java.util.Scanner;

public class Java21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
            System.out.print("Enter Physics Marks: ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry Marks: ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Maths Marks: ");
        marks[2] = sc.nextInt();
        System.out.println("Physics Marks: " + marks[0]);
        System.out.println("Chemistry Marks: " + marks[1]);
        System.out.println("Maths Marks: " + marks[2]);
        sc.close();
    }
}