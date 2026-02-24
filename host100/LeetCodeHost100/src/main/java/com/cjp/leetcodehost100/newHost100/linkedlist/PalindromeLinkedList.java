/**
 * 234. 回文链表 (Palindrome Linked List)
 * 
 * 题目描述：
 * 给你一个单链表的头节点 head，请你判断该链表是否为回文链表。如果是，返回 true；否则，返回 false。
 * 
 * 示例：
 * 输入：head = [1,2,2,1]
 * 输出：true
 * 
 * 输入：head = [1,2]
 * 输出：false
 * 
 * 提示：
 * 链表中节点数目在范围 [1, 10^5] 内
 * 0 <= Node.val <= 9
 * 
 * 进阶：你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 */
public class PalindromeLinkedList {
    
    // 链表节点定义
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    // TODO: 实现解决方案
    public boolean isPalindrome(ListNode head) {
        // 待实现
        return false;
    }
}