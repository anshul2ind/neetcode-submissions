class Solution {
    public boolean isAnagram(String s, String t) {
        if ((s == null && t != null) || (t == null && s != null) || t.length() != s.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Map<Character, Integer> sMap = new HashMap();
        Map<Character, Integer> tMap = new HashMap();
        Set<Character> keys = new HashSet();
        for (var val : sArr) {
            keys.add(val);
            sMap.put(val, sMap.getOrDefault(val, 0) + 1);
        }
        for (var val : tArr) {
            keys.add(val);
            tMap.put(val, tMap.getOrDefault(val, 0) + 1);
        }

        for (var key : keys) {
            var sVal = sMap.get(key);
            var tVal = tMap.get(key);
            if (sVal == null || tVal == null || !sVal.equals(tVal)) {
                return false;
            }
        }

        return true;
    }
}
