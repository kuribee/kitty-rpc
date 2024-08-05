package com.kitty.rpc.core.leetcode;

import java.util.HashMap;

public class P1 {
    public static void main(String[] args) {

    }
    //利用哈希表，每一次循环，哈希表具有该循环之前元素，即可一次循环找到
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}
