class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (var num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>(
            // Comparator.comparingInt(Map.Entry::getValue).reversed()
            (a, b) -> Integer.compare(b.getValue(), a.getValue()));

        for (var val : map.entrySet()) {
            maxHeap.offer(val);
        }

        for (int i = 0; i < k; i++) {
            list.add(maxHeap.poll().getKey());
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
