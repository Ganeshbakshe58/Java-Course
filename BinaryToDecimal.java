public class BinaryToDecimal {
    public static void bintodec(int binNum) {
        int mynum = binNum;
        int pow = 0;
        int dec = 0;
        while(binNum > 0 ){
            int lastdec = binNum % 10;
            dec = dec + (lastdec * (int)Math.pow(2, pow));
            pow++;

            binNum = binNum/10;
        }
        System.out.println("Decimal of Binary Number " +mynum +" is " +dec );
    }
    public static void main(String[] args) {
        bintodec(101);
    }
}
