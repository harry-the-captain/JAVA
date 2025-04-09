class Solution{
    static int evenlyDivides(int N){
        // code here
        int absN = Math.abs(N);
        // Convert the absolute number to a string
        String nStr = Integer.toString(absN);
        // Initialize the count of divisible digits
        int count = 0;
        
        // Iterate through each character in the string representation of the number
        for (char c : nStr.toCharArray()) {
            // Convert character to integer
            int digit = Character.getNumericValue(c);
            
            // Check if the digit is non-zero and divides n without leaving a remainder
            if (digit != 0 && absN % digit == 0) {
                count++;
            }
        }
        
        return count;
    }
}
