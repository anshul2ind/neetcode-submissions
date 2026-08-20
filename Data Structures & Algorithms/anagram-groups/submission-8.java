class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(var str: strs) {
            // String key = sortString(str);
            int[] chars = new int[26];
            for(var ch: str.toCharArray()) {
                chars[ch - 'a']++;
            }
            String key = Arrays.toString(chars);
            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
