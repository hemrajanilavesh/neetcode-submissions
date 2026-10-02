class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;
        while(left < right) {
            int length = Math.min(heights[left], heights[right]);
            int width = (right - left);
            int area = length * width;
            maxArea = Math.max(area, maxArea);
            if (heights[left] == heights[right] || heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
