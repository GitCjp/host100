package com.cjp.daimasuixianglu.lianbiao.host142;

import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        //虚拟链表
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        HashSet<ListNode> set = new HashSet<>();
        ListNode cur = dummyHead;
        while (cur != null) {
            if (set.contains(cur)) {
                return cur;
            } else {
                set.add(cur);
            }
            cur = cur.next;
        }
        return null;
    }
}