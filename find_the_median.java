class Solution
{
    public int find_median(int[] v)
    {
        // Code here
        Arrays.sort(v);
        int  start = 0;
        int end = v.length-1;
        int mid = (start + end)/2;
        
        if(v.length%2 !=0)
        {
           return v[mid]; 
        }
        else if(v.length%2==0)
        {
            return (v[mid] + v[mid + 1])/2;
        }
       return -1;
    }
}
