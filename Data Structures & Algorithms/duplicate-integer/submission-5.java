class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();
        for(var num : nums) {
            set.add(num);
        }
        return set.size() != nums.length;
    }
}