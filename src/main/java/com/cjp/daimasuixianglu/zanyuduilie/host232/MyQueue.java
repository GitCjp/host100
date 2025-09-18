package com.cjp.daimasuixianglu.zanyuduilie.host232;

import java.util.Stack;

class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;


    public MyQueue() {
        stackIn = new Stack<>(); // 负责进栈
        stackOut = new Stack<>(); // 负责出栈
    }

    //把元素推到队列末尾
    public void push(int x) {
        stackIn.push(x);
    }

    //移除队列的开头
    public int pop() {
        dumpstackIn();
        return stackOut.pop();
    }

    //返回队列开头的元素
    public int peek() {
        dumpstackIn();
        return stackOut.peek();
    }

    //判断是否为空
    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }

    // 如果stackOut为空，那么将stackIn中的元素全部放到stackOut中
    private void dumpstackIn(){
        if (!stackOut.isEmpty()) return;
        while (!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */