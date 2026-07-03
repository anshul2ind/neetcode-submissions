class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            map.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            var val = map.get(nums[i]);
            if (val != null && !val.equals(i)) {
                return new int[] {Math.min(val, i), Math.max(val, i)};
            }
        }

        return new int[] {};
    }
}
