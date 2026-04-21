class Solution {
    public int majorityElement(int[] nums) {
        int target = nums.length/2;
        for(int num : nums) {
            int count = 0;
            for(int i : nums) {
                if(num == i) {
                    count++;
                }
            }
            if(count > target) {
                return num;
            }
        }

        return 0;
    }
}