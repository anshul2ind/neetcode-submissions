class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int l = 0, r = heights.length -1;
        while(l < r) {
            int h = Math.min(heights[l], heights[r]);
            int area = h * (r - l);
            max = Math.max(area, max);
            if(heights[l] < heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
