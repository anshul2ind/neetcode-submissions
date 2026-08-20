class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length()) {
            return -1;
        }
        char[] sub = needle.toCharArray();
        int subLength = sub.length;
        char[] arr = haystack.toCharArray();
        for(int i = 0; i < arr.length - subLength + 1; i++) {
            boolean match = false;
            int j = 0;
            while( j < subLength) {
                if(sub[j] != arr[i+j]) {
                    break;
                }
                ++j;
            }
            if (j == subLength) {
                return i;
            }
        }

        return -1;
        
    }
}