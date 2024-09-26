class Solution {
    public int CountPS(String s, int n) {
        // code here
        //int k = s.length();
        int count = 0;
        
        // Expand around center for all possible palindromes
        for (int i = 0; i < n; i++) {
            // Count odd length palindromes
            count += expandAroundCenter(s, i, i);
            
            // Count even length palindromes
            count += expandAroundCenter(s, i, i + 1);
        }
        
        return count;
    }
    
    // Function to expand around the center and count palindromes
    private int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            // Only count substrings with length >= 2
            if (right - left + 1 >= 2) {
                count++;
            }
            left--;
            right++;
        }
        
        return count;
    }
}
