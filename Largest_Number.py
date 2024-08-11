class Solution2
{
public static int Largest(int n, int[] arr)
{
int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
  }

public static void main(String[] args)
{
  int[] arr = {1,8,7,56,90};
  int n = arr.length;
  Largest(n,arr);
}
}
