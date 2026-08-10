class Solution {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while( s < e) {
            int m = (s+e)/2;
            if(nums[m] > nums[e]) {
                s = m + 1;
            } else {
                e = m;
            }
        }

        int pivot = s;

        int result = binarySearch(nums, target, 0, pivot-1);
        return result == -1 ? binarySearch(nums, target, pivot, nums.length - 1) : result;
    }


    public int binarySearch(int[] nums, int target, int s, int e) {
        while(s <= e) {
            int m = (s+e)/2;
            int mVal = nums[m];
            if(target < mVal) {
                e = m - 1;
            } else if(target > mVal) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}

