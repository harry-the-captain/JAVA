class removeEvenElement {
    public static int[] removeElement(int[] arr) {

        int oddcount = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] % 2 != 0) 
            {
                oddcount++;
            }
        }

        int[] result = new int[oddcount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] % 2 != 0) 
            {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
        int[] result = removeElement(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(result[i]);
        }
    }

}
