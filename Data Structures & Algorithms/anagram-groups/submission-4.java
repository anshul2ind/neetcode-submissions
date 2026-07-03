class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                List<String> list = new ArrayList();
                list.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    if (strs[j] != null && isAnagram(strs[i], strs[j])) {
                        list.add(strs[j]);
                        strs[j] = null;
                    }
                }
                lists.add(list);
            }
        }
        return lists;
    }

    public boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Set<Character> set = new HashSet();
        Map<Character, Integer> map1 = new HashMap();
        Map<Character, Integer> map2 = new HashMap();
        for (var val : s1.toCharArray()) {
            set.add(val);
            map1.put(val, map1.getOrDefault(val, 0) + 1);
        }

        for (var val : s2.toCharArray()) {
            set.add(val);
            map2.put(val, map2.getOrDefault(val, 0) + 1);
        }

        for (var key : set) {
            var val1 = map1.getOrDefault(key, 0);
            var val2 = map2.getOrDefault(key, 0);
            if (!val1.equals(val2)) {
                return false;
            }
        }
        return true;
    }
}
