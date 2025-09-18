package com.cjp.daimasuixianglu.zanyuduilie.host150;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String s : tokens) {
            if(s.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }else if(s.equals("-")){
                stack.push(-stack.pop() + stack.pop());
            }else if(s.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }else if(s.equals("/")){
                int pop1 = stack.pop();
                int pop2 = stack.pop();
                stack.push(pop2 / pop1);
            }else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();
    }
}