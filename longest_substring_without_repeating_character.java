class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), longest = 0;
        int[] nextIndex = new int[128];

        for(int i=0, j=0; i<n; i++){
            j = Math.max(nextIndex[s.charAt(i)], j);
            longest = Math.max(longest, i-j+1);
            nextIndex[s.charAt(i)] = i + 1;
        }
        return longest;
    }
}
