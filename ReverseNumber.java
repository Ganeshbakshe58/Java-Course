public class ReverseNumber {
    public static void main(String[] args) {
        for(int n = 10899; n > 0; n /= 10) {
            int rem  = n % 10;
            System.out.print(rem);
        }
    }
}
