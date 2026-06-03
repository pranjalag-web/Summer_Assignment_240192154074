class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int area=0;
        int maxc=0;
        while(l<r){
            if(height[r]<=height[l]){
                area=Math.min(height[l],height[r])*(r-l);
                r--;
            }
            else{
                area=Math.min(height[l],height[r])*(r-l);
                l++;
            }
            maxc=Math.max(maxc,area);
        }
        return maxc;
    }
}