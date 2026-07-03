class Solution {
    public boolean isAnagram(String s, String t) {
        if((s == null && t != null) || (t == null && s != null) || t.length() != s.length())
         {
            return false;
         }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        int chars = sArr.length - 1;
        while(chars >= 0) {
            if(sArr[chars] != tArr[chars]) {
                return false;
            }
            --chars;
        }

        return true;
       
    }
}
