class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList();
        for(int i = 0; i < strs.length; i++) {
            if(strs[i] == null) {
                continue;
            }
            var list = new ArrayList<String>();
            list.add(strs[i]);
            for(int j = i; j < strs.length; j++) {
                if(j != i && strs[j] != null && isAnagram(strs[i], strs[j])) {
                    list.add(strs[j]);
                    strs[j] = null;
                }
            }
            strs[i] = null;
            result.add(list);
        }

        return result;
    }

    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        for (int i = 0; i < arr1.length; i++) {
            var count1 = map.getOrDefault(arr1[i], 0);
            if (count1 == -1) {
                map.remove(arr1[i]);
            } else {
                map.put(arr1[i], count1 + 1);
            }

            var count2 = map.getOrDefault(arr2[i], 0);
            if (count2 == 1) {
                map.remove(arr2[i]);
            } else {
                map.put(arr2[i], count2 - 1);
            }
        }

        return map.size() == 0;
    }
}
