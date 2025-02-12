class Solution {
    public int reverse(int x) {
        // " long reverse = 0;         // it does not folow Assume the environment does not allow you to store 64-bit integers (signed or unsigned)

        // while(x!=0){
        //     reverse = reverse*10 + x%10;
        //     x /= 10;

        // }
        // if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
        //     return 0;
        // }
        // return (int) reverse;   "


        // This follows constraints
        int reverse = 0;
        while (x != 0) {
            int num = x % 10;
            x /= 10;

            if (reverse > Integer.MAX_VALUE / 10 || (reverse == Integer.MAX_VALUE / 10 && num > 7)) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE / 10 || (reverse == Integer.MIN_VALUE / 10 && num < -8)) {
                return 0;
            }

            reverse = reverse * 10 + num;
        }
        return reverse;
    }
}
