package com.kitty.rpc.core.leetcode;

import java.util.HashSet;

public class P3 {
    //放入集合，从数组中找出一个开头的数，开头的数就是其-1(减去-1)不在集合中
    //从开头的数开始计数
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> num_set=new HashSet<>();
        for(Integer num:nums){
            num_set.add(num);
        }
        Integer longestStreak=0;
        for(Integer num:nums){
            if(!num_set.contains(num-1)){
                Integer currentStreak=1;
                Integer currentNum=num;
                while(num_set.contains(currentNum+1)){
                    currentStreak+=1;
                    currentNum+=1;
                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
        }
        return longestStreak;
    }
}
