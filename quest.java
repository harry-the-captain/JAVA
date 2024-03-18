// variable might have not been initialize error occured

public class quest {
    public static void main(String[] args) {
        int sum;
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println("sum is: " + sum);
    }
}