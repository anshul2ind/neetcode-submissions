class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> sum = new HashMap();

        for(int i = 0; i < numbers.length; i++) {
            sum.put(numbers[i], i);
        }

        for(int j = 0; j < numbers.length; j++) {
            var diff = target-numbers[j];
            if(sum.containsKey(diff) && sum.get(diff) != j ) {
                var i = sum.get(diff)+1;
                ++j;
                return i < j ? new int[] {i,j} : new int[] {j,i};
            }
        }

        return null;
    }
}
