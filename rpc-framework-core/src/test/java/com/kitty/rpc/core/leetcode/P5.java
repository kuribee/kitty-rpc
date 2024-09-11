package com.kitty.rpc.core.leetcode;

public class P5 {
    public int maxArea(int[] height) {
        int length=height.length;
        int left=0,right=length-1;
        int ans=0;
        while(left<right){
            int area=Math.min(height[left],height[right])* (right-left);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            ans=Math.max(ans,area);
        }
        return ans;
    }
}
