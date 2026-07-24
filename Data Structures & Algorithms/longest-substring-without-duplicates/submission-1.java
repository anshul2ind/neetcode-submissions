class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap();
        int l = 0;
        int r = 0;
        int maxLen = 0;
        char[] str = s.toCharArray();
        while(r < str.length) {
            var ch = str[r];
            if(map.containsKey(ch) && map.get(ch) >= l ) {
                maxLen = Math.max(maxLen, r-l);
                l = map.get(ch) + 1;
            } else {
                map.put(ch, r);
                ++r;
            }

        }
        return Math.max(maxLen, r-l);
        
    }
}
