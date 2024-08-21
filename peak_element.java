
class Peak_element
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public static int peakElements(int[] arr,int n)
    {
       //add code here.
       int peak = 0;
       for(int i=0; i<n-1; i++)
       {
           if(arr[i] < arr[i+1])
           {
               peak = i + 1;
           }
       }
       return peak;
       
    }
    public static void main(String[] args)
    {
        int[] arr = {1,4,5,9,6,7};
        int n = arr.length;
        int result = peakElements(arr,n);
        System.out.println(result);

    }
}
