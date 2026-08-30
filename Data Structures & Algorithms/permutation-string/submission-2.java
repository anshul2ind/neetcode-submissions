class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int match = 0;
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> s1Count = new HashMap<>();
        Map<Character, Integer> s2Count = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            s1Count.put(s1.charAt(i), s1Count.getOrDefault(s1.charAt(i), 0) + 1);
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0) + 1);
        }

        int l = 0;
        for (int r = s1.length(); r < s2.length(); r++) {
            System.out.println(s1Count);
            System.out.println(s2Count);
            if (s1Count.equals(s2Count)) {
                return true;
            }
            s2Count.put(s2.charAt(r), s2Count.getOrDefault(s2.charAt(r), 0) + 1);
            int lCount = s2Count.getOrDefault(s2.charAt(l), 0);
            if (lCount == 1) {
                s2Count.remove(s2.charAt(l));
            } else {
                s2Count.put(s2.charAt(l), lCount - 1);
            }
            ++l;
        }

        return s1Count.equals(s2Count);
    }
}
