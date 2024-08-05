package com.kitty.rpc.core.leetcode;

import java.util.HashSet;

public class P3 {
    //放入集合，从数组中找出一个开头的数，开头的数就是其-1(减去-1)不在集合中
    //从开头的数开始计数
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:nums){
            hashSet.add(num);
        }
        int ansStrea=0;
        for(int i=0;i<nums.length;i++){
            if(!hashSet.contains(nums[i]-1)){
                int streak=1;
                int currentNum=nums[i];
                while(hashSet.contains(currentNum+1)){
                    currentNum++;
                    streak++;
                }
                ansStrea=Math.max(ansStrea,streak);
            }
        }
        return ansStrea;
    }
}
