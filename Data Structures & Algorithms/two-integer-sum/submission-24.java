class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++) {
            map.put(target-nums[i], i);
        }

        for(int i = 0 ; i < nums.length; i++) {
            var stored = map.get(nums[i]);
            if(stored != null && stored != i) {
                return new int[] {
                    Math.min(stored,i),
                    Math.max(stored,i)
                };
            }
        }
        // for(int i = 0; i < nums.length - 1; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             return new int[] {i, j};
        //         }
        //     }
        // }
        return null;
    }
}
