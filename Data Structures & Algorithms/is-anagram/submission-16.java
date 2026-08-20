class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sArr.length; i++) {
            map.put(sArr[i], map.getOrDefault(sArr[i], 0) + 1);
            map.put(tArr[i], map.getOrDefault(tArr[i], 0) - 1);
            if (map.get(sArr[i]) != null && map.get(sArr[i]) == 0) {
                map.remove(sArr[i]);
            }
            if (map.get(tArr[i]) != null && map.get(tArr[i]) == 0) {
                map.remove(tArr[i]);
            }
        }
        return map.size() == 0;
    }
}
