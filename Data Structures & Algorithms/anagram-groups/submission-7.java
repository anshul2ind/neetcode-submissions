class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(var str: strs) {
            String sorted = sortString(str);
            map.putIfAbsent(sorted, new ArrayList<String>());
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public String sortString(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
