package com.cjp.host100.host49;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> map = new HashMap<String ,List<String>>();
        //遍历
        for (String str : strs) {
            //转换成字符数组
            char[] array = str.toCharArray();
            //排序
            Arrays.sort(array);
            //转换成字符串
            String key = new String(array);
            //map.getOrDefault（）用来安全地获取键对应的值，并在键不存在时返回一个默认值。
            //List<String> list = map.getOrDefault(key, new ArrayList<String>());
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<String>());
            }
            //添加到list集合中
            map.get(key).add(str);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
