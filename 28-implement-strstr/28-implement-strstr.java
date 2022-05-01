class Solution {
    public int strStr(String haystack, String needle) {
        outer: for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }

            if (haystack.length() < i + needle.length()) {
                break;
            }

            for (int j = 1; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    continue outer;
                }
            }
            
            return i;
        }
        
        return -1;
    }
}