class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        
        int even = 0;
        int odd = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2 != 0)
            {
                // even = even + i;
                // print()
                odd++;
            }
            // else if(arr[i]%2 != 0)
            else
            {
                // odd = odd + i;
                // return odd;
                even++;
            }
        }
        int[] res = new int[2];
        res[0] = odd;
        res[1] = even;
        
        return res;
    }
}
