class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(var str : strs) {
            // int[] arr = new int[26];
            // for(var ch: str.toCharArray()) {
            //     arr[ch - 'a']++;
            // }
            // String key = Arrays.toString(arr);

            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);
            
            map.putIfAbsent(key, new ArrayList());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
        
    }
}
