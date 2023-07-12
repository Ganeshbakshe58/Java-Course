// Largest and smallest Number in an array.

public class Java22 {
    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("Smallest Number is " +smallest);
        return largest;

        
    }
    public static void main(String[] args) {
        int num[] = {1,4,6,2,3};
        System.out.println("Largest Number is " + getLargest(num));
        
    }
}
