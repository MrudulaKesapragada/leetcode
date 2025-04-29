class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastSeen = new int[128];  // ASCII size
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;  // Initialize with -1 (not seen yet)
        }

        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (lastSeen[c] >= start) {
                start = lastSeen[c] + 1;  // Move start to avoid repeat
            }

            lastSeen[c] = end;  // Update last seen index
            maxLength = Math.max(maxLength, end - start + 1);
            }

        return maxLength;
        
    }
}