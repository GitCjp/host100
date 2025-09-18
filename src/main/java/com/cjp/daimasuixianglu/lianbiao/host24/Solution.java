package com.cjp.daimasuixianglu.lianbiao.host24;

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
    public ListNode swapPairs(ListNode head) {
        ListNode dmmyHead = new ListNode();
        dmmyHead.next = head;
        ListNode cur = dmmyHead;
        while (cur.next != null&&cur.next.next!=null) {
            //保存一下虚拟指针的下一位
            ListNode temp = cur.next;
            //保存一下虚拟指针的下一位的下一位的下一位
            ListNode temp1 = cur.next.next.next;
            //虚拟头指针指向2
            cur.next = cur.next.next;
            //2指向1
            cur.next.next = temp;
            //1指3
            temp.next = temp1;
            cur = cur.next.next;

        }
        return dmmyHead.next;
    }
}