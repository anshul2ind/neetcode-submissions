class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = 0;
        int r = k-1;
        List<Integer> list = new ArrayList();
        while(r < nums.length) {
            int i = l;
            int max = nums[l];
            while(i <= r) {
                if(nums[i] > max) {
                    max = nums[i];
                }
                ++i;
            }
            list.add(max);
            ++l;
            ++r;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
