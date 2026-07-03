class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums.length <= 1) {
            return false;
        }
        Set<Integer> set = new HashSet();
        for(var val: nums) {
            if(set.contains(val)) {
                return true;
            }
            set.add(val);
        }
        return false;
    }
}