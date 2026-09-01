class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
        //     // Comparator.comparingInt(Map.Entry::getValue).reversed()
        //     (a, b) -> Integer.compare(b.getValue(), a.getValue()));

        // for (var val : map.entrySet()) {
        //     maxHeap.offer(val);
        // }

        // for (int i = 0; i < k; i++) {
        //     list.add(maxHeap.poll().getKey());
        // }
        List<int[]> list = new ArrayList<>();
        for(var entry : map.entrySet()) {
            list.add(new int[] {entry.getKey(), entry.getValue()});
        }

        list.sort((a, b) -> Integer.compare(b[1], a[1]));
        // List<Integer> list2 = new ArrayList<>();

        return list.subList(0, k).stream()
        .map(arr -> arr[0]).mapToInt(Integer::intValue).toArray();
    }
}
