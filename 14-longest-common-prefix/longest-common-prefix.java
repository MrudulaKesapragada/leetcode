class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Take the first string as the prefix to compare against others
        String prefix = strs[0];
        
        // Compare the prefix with each string
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix by comparing with each string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
        
 