class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;

        for (int left = 0; left <= arr.length - k; left++) {
            int sum = 0;
            for (int right = 0; right < k; right++) {
                sum += arr[right + left];
            }
            int avg = sum / k;
            if (avg >= threshold) {
                count++;
            }
        }
        return count;
    }
}