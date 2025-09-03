package com.cjp.host100.lianbiao.host203;


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        //删除头结点
        while (head != null && head.val == val) {
            head = head.next;
        }
        //删除其他节点
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                //不相等就下一位
                cur = cur.next;
            }
        }
        return head;
    }
}

class Solution2 {
    public ListNode removeElements(ListNode head, int val) {
        //虚拟头结点
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        //然后直接删除中间的结点
        ListNode cur2 = dummyHead;
        while (cur2.next!= null) {
            if (cur2.next.val == val) {
               cur2.next = head.next.next;
            } else {
                cur2 = cur2.next;
            }
        }
        return head;
    }
}