// sum of elements using recursion

class SumOfArrayElements 
{
 
     private static int calculateSum(int a[], int n) 
{
 
         if (n <= 0) 
         {
            return 0;
         }
          return calculateSum(a, n-1 ) + a[n-1];
       }
 
      public static void main(String[] args) {
 
         int a[] = {10,20,30,40,50,60};
         int sum = calculateSum(a, a.length);
 
          System.out.println("Sum of elements using recursion:" +sum);
      }
 
}