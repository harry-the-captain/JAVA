class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int j = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] != 0)
            {
                if(i != j)
                {
                    arr[j] = arr[i];
                    arr[i] = 0;
                }
                j += 1;
            }
        }
    }
}
