class LinearSearch
{
    public static void main(String[] args) {
        
        int arr[] = {12,32,43,56,78,45,36};
        int item = 54;
        int temp = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == item)
            {
                System.out.println("element at: "+i);
                temp += 1;
            }
            
        }
        if(temp==0)
            {
                System.out.println("element not found");
            }
    }
}
