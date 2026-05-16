class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul = 1;
        int[] result = new int[nums.length];
        for(int i = 0; i< nums.length;i++){
            var res = 1;
            for(int j = 0; j < nums.length; j++) {
                if(i != j) {
                    res *= nums[j];
                }
            }
            result[i] = res;
        }

        return result;
    }
}  
