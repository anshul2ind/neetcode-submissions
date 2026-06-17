class Solution {
    public int findDuplicate(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(i != j && nums[i] == nums[j]) {
                    return nums[j];
                }
            }
        }
        return 0;
    }

    public int incre(int curr, int len) {
        if(curr == len - 1) {
            return 0;
        } else {
            return curr + 1;
        }
    }
}
