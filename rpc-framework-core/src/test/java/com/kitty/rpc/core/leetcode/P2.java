package com.kitty.rpc.core.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class P2 {
    public static void main(String[] args) {
        String[] s=new String[]{"abt","tba","abc"};
        groupAnagrams(s);
    }
    //字符串重新排序，可以将多个字母异位词变成一个
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hashMap=new HashMap<>();
        for(String str:strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            List<String> list = hashMap.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            hashMap.put(key,list);
        }
        return new ArrayList<List<String>>(hashMap.values());
    }
}
