class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(var num: nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
        
    }
}