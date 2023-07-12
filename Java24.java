public class Java24 {
    public static void reverse(int numbers[]) {
        int firstNum = 0;
        int lastNum = numbers.length-1;
        while(firstNum < lastNum){
            // Swap
            int temp = numbers[lastNum];
            numbers[lastNum] = numbers[firstNum];
            numbers[firstNum] = temp;

            firstNum++;
            lastNum--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = {3,5,7,4,9};

        reverse(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
