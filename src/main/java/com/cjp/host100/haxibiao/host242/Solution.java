package com.cjp.host100.haxibiao.host242;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean isAnagram(String s, String t) {
        // 长度不同直接返回 false
        if(s.length() != t.length()){
            return false;
        }

        // 使用 HashMap 统计字符频次
        HashMap<Character, Integer> map1 = new java.util.HashMap<>();
        HashMap<Character, Integer> map2 = new java.util.HashMap<>();

        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        // 统计 s 中字符频次
        for (char c : s1) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // 统计 t 中字符频次
        for (char c : t1) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // 比较两个 map 是否相等
        return map1.equals(map2);
    }
}
class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] table = new int[26];
        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            table[t.charAt(i) - 'a']--;
            if (table[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}