class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int[][] A = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++) {
            A[i][0] = i;
            A[i][1] = nums[i];
        }

        Arrays.sort(A, Comparator.comparingInt(a -> a[1]));

        while(left < right) {
            int sum = A[left][1] + A[right][1];
            if(sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                int i = Math.min(A[left][0], A[right][0]);
                int j = Math.max(A[left][0], A[right][0]);
                return new int[] {i, j};
            }
        }

        return null;
    }
}
