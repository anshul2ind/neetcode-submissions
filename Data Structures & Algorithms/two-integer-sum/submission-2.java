class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap();
      for(int i = 0; i < nums.length; i++) {
        map.put(target-nums[i], i);
      }

      for(int i = 0; i < nums.length; i++) {
        if(map.containsKey(nums[i]) && i != map.get(nums[i])) {
            int[] result = {i, map.get(nums[i])};
        return result;
        }
      }

      return null;

    }
}
