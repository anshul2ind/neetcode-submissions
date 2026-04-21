class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;

        for(int left = 0; left <= arr.length - k; left++) {
            int sum = 0;
            // System.out.println("left : " +left);
            for(int right = 0; right < k; right++) {
            sum += arr[right+left];
            }
            int avg = sum/k;
            // System.out.println("avg : " +avg);
            if(avg >= threshold) {
                count++;
            }
        }
        return count;
    }
}