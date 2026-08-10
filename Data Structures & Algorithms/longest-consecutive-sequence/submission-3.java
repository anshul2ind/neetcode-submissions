class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet();
        for (var num : nums) {
            set.add(num);
        }

        int max = 0;

        for (var num : set) {
            if (!set.contains(num - 1)) {
                int counter = num;
                while (set.contains(++counter)) {
                }
                max = Math.max(max, counter - num);
            }
        }

        return max;
    }
}
