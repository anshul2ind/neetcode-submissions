class Solution {
    public void sortColors(int[] nums) {
        var counts = new int[3];
        for(var num : nums) {
            counts[num] += 1;
        }
        int index = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < counts[i]; j++) {
                nums[index++] = i;
            }
        }

    }
}