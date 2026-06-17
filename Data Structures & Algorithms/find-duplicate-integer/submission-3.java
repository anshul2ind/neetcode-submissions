class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        int i = 0;
        while(!set.contains(nums[i]) && i < nums.length) {
            set.add(nums[i]);
            i++;
        }
        return nums[i];
    }

    public int incre(int curr, int len) {
        if(curr == len - 1) {
            return 0;
        } else {
            return curr + 1;
        }
    }
}
