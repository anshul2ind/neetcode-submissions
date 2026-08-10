class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
     
        String s1 = getSortedString(s);
        String t2 = getSortedString(t);
        return s1.equals(t2);
    }

    public String getSortedString(String str) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
}
