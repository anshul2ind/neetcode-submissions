class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        for(var num: nums) {
            var count = map.getOrDefault(num, 0);
            map.put(num, count+1);
        }


        var result = new int[k];
        for(int i = 0; i < k; i++) {
            int max = 0;
            int maxKey = 0;
            for(var entry: map.entrySet()) {
                if(entry.getValue() > max) {
                    max = entry.getValue();
                    maxKey = entry.getKey();

                }
            }
            result[i] = maxKey;
            map.remove(maxKey);

        }
        return result;
    }
}
