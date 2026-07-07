class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;

        int maxArea = Integer.MIN_VALUE;

        while(left < right){
            int currHeight = Math.min(height[left],height[right]);
            int width = right - left;
            int currArea = currHeight * width;
            maxArea = Math.max(maxArea,currArea);
            while( left < right && height[left] <= currHeight){
                 left++;
            }
            while( left < right  && height[right] <= currHeight){
                right--;
            }
        }

        return maxArea;
    }
}