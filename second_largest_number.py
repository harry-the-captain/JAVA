import java.util.Arrays;

class largest_number {
    public static int print2largest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }

        Arrays.sort(arr);
        
        int largest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < largest) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int result = print2largest(arr);
        System.out.println("The second largest number is: " + result);
    }
}
