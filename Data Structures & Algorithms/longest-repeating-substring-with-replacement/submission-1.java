class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int l = 0;
        char[] arr = s.toCharArray();
        for(int r = 0; r < arr.length; r++) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);

            while((r - l + 1) - Collections.max(map.values()) > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                l++;
            }

            int window = r - l + 1;

            max = Math.max(max, window);
        }
        return max;
    }
}
