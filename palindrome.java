class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int original = n;
        int result = 0;
        
        while(n != 0)
        {
            int num = n % 10;
            result = result * 10 + num;
            n = n / 10;
        }
            
            if (original == result)
             {
                return "Yes";
             }
            else
             {
                return "No";
             }
    
    }
}
