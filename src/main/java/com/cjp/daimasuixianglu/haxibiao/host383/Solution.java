package com.cjp.daimasuixianglu.haxibiao.host383;

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();

        //把ran的元素放到map中
        for (char c : ran) {
            if (map.containsKey(c)) {
                //重复加1
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //遍历mag，存在相同的。value就减少1
        for (char c : mag) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }
        //在遍历查看value是否有大于0的
        for (char c : ran) {
            if(map.get(c) > 0){
                return false;
            }
        }
        return true;
    }
}