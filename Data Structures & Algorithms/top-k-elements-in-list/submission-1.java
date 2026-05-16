class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var map = new HashMap<Integer, Integer>();
        List<Integer>[] arr = new ArrayList[nums.length + 1];
        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            var list = arr[entry.getValue()];
            if (list == null) {
                list = new ArrayList<Integer>();
                arr[entry.getValue()] = list;
            }
            list.add(entry.getKey());
        }

        List<Integer> result = new ArrayList<Integer>();
        for (int i = arr.length - 1; i > 0; i--) {
            var list = arr[i];
            if (list != null && list.size() > 0) {
                for (var listItem : list) {
                    result.add(listItem);
                    if (result.size() == k) {
                        return result.stream().mapToInt(Integer::intValue).toArray();
                    }
                }
            }
        }

        return new int [0];
    }
}
