package com.cjp.daimasuixianglu.lianbiao.host19;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //虚拟头结点
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        //定义快慢指针
        ListNode fast = dummyHead;
        ListNode slow = dummyHead;
        //先移动快指针n+1次
        for (int  i = 1;  i <= n;  i++) {
            fast = fast.next;
        }
        //然后快慢指针往后，直到快指针为null
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        //删除元素
        // 此时 slowIndex 的位置就是待删除元素的前一个位置。
        // 具体情况可自己画一个链表长度为 3 的图来模拟代码来理解
        // 检查 slowIndex.next 是否为 null，以避免空指针异常
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return dummyHead.next;
    }
}