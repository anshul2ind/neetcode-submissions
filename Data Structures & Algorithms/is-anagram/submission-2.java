class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap();
        var sArr = s.toCharArray();
        var tArr = t.toCharArray();
        if (sArr.length != tArr.length) {
            return false;
        }

        for (int i = 0; i < sArr.length; i++) {
            var count = map.getOrDefault(sArr[i], 0);
            if (count == -1) {
                map.remove(sArr[i]);
            } else {
                map.put(sArr[i], count + 1);
            }

            var tCount = map.getOrDefault(tArr[i], 0);
            if (tCount == 1) {
                map.remove(tArr[i]);
            } else {
                map.put(tArr[i], tCount - 1);
            }
        }

        return map.size() == 0;
    }

    public void bubbleSort(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
