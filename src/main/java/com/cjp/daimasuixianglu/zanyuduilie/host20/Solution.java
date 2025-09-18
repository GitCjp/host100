package com.cjp.daimasuixianglu.zanyuduilie.host20;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else
                stack.push(c);// 没有匹配的就放进去
        }
        return stack.isEmpty();
    }
}
class Solution2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();

        for(char c : s.toCharArray()){

            if(c =='('|| c=='{'||c=='['){
                stack.push(c);
            }

            if(c==')'||c=='}'||c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top =  stack.pop();

                if((c == ')' && top != '(') ||(c == ']' && top != '[') ||(c == '}' && top != '{')){
                    return false;
                }
            }

        }

        return stack.isEmpty();

    }
}