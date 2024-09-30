class Solution {
    public int addDigits(int num) {

    // by recursive method
    if(num < 10) return num;
       int ans = 0;
       while(num != 0) {
            ans = ans + (num % 10);
            num /= 10;
       } 
       return addDigits(ans);

    }
}
