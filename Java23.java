// BinarySearch 
// Search a number with the help of index

public class Java23 {

    public static int BinarySearch(int numbers[], int key) {
    int start = 0;
    int end = numbers.length - 1;
    while(start <= end) {
        int mid = (start + end) / 2;
        if(numbers[mid] == key) {
            System.out.println("Key at Index: " + mid);
            return mid;
        }
        else if(numbers[mid] < key) {
            start = mid + 1;
        }
        else {
            end = mid - 1;
        }        
    }
    return -1;
}
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("index of the key is " + BinarySearch(numbers, key));
    }
}
