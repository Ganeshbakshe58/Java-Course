public class DecimalToBinary {
    public static void DecToBin (int num) {
        int mynum = num;
        int pow = 0;
        int BinNum = 0;

        while (num > 0){
            int rem = num % 2;
            BinNum = BinNum + (rem*(int)Math.pow(10,pow));
            pow++;

            num = num/2;
        }
        System.out.println("Binary Number of " +mynum +" is " +BinNum);
    }
    public static void main(String[] args) {
        DecToBin(12);
    }
}
