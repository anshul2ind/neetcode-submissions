class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int target = nums.length/2;

        for(int i = 0; i < nums.length; i++ ) {
            int count = map.getOrDefault(nums[i], 0) + 1;
            map.put(nums[i], count);
        }

        for(int key : map.keySet()) {
            if(map.get(key) > target) {
                return key;
            }
        }

        return 0;
        
    }
}