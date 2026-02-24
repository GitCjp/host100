/**
 * 206. 反转链表 (Reverse Linked List)
 * 
 * 题目描述：
 * 给你单链表的头节点 head，请你反转链表，并返回反转后的链表。
 * 
 * 示例：
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 * 
 * 输入：head = [1,2]
 * 输出：[2,1]
 * 
 * 输入：head = []
 * 输出：[]
 * 
 * 提示：
 * 链表中节点的数目范围是 [0, 5000]
 * -5000 <= Node.val <= 5000
 * 
 * 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？
 */
public class ReverseLinkedList {
    
    // 链表节点定义
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    // TODO: 实现解决方案
    public ListNode reverseList(ListNode head) {
        // 待实现
        return null;
    }
}