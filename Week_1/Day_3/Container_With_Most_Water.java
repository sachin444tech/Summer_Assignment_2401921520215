class Solution {
    public int maxArea(int[] height) {
    int maxWater = 0, left = 0, right = height.length-1;
    while(left<right){
         int width = right-left;
         int ht = Math.min(height[left],height[right]);
         int currWater = width*ht;
         maxWater = Math.max(currWater,maxWater);
         if(height[left]>height[right]) right--;
         else left++;
    }
    return maxWater;
    }
}