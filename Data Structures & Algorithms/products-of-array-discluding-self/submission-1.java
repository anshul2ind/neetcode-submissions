class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] sufix = new int[nums.length];
        int prefixVal = 1;
        int sufixVal = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = prefixVal;
            prefixVal *= nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            sufix[i] = sufixVal;
            sufixVal *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * sufix[i];
        }

        return result;
    }
}
