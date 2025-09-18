package com.cjp.daimasuixianglu.zifuchuan.host514;

class Solution {
    public String reverseStr(String s, int k) {
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        //每次移动2k
        for (int i = 0; i < length; i += 2 * k) {
            //翻转k个字符
            swap(charArray, i, Math.min(i + k - 1, length - 1));
        }
        return new String(charArray);
    }

    private char[] swap(char[] charArray, int left, int right ) {
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return charArray;
    }
}


