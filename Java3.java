// Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill. 
// (Add on: You can also try adding 18% gst tax to the items in the bill as an advance problem)

import java.util.*;

public class Java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float gst = (pencil + pen + eraser)*0.18f;
        float Total = (pencil + pen + eraser) + gst;
        System.out.println("Total Amount is " +Total + "Rs");

    }
}