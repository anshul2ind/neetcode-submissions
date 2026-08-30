class Solution {
    public boolean checkInclusion(String s1, String s2) {
        String s1Sorted = sortedString(s1);
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String sub = s2.substring(i, i + s1.length());
            String sorted = sortedString(sub);
            System.out.println(sorted);
            if (s1Sorted.equals(sorted)) {
                return true;
            }
        }
        return false;
    }

    public String sortedString(String s) {
        char[] s1Arr = s.toCharArray();
        Arrays.sort(s1Arr);
        return new String(s1Arr);
    }
}
