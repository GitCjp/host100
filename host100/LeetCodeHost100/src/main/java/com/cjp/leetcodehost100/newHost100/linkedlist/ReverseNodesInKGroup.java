/**
 * 25. K 个一组翻转链表 (Reverse Nodes in k-Group)
 * 
 * 题目描述：
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * 
 * 示例：
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[2,1,4,3,5]
 * 
 * 输入：head = [1,2,3,4,5], k = 3
 * 输出：[3,2,1,4,5]
 * 
 * 输入：head = [1,2,3,4,5], k = 1
 * 输出：[1,2,3,4,5]
 * 
 * 输入：head = [1], k = 1
 * 输出：[1]
 * 
 * 提示：
 * 链表中节点的数目为 n
 * 1 <= k <= n <= 5000
 * -1000 <= Node.val <= 1000
 */
public class ReverseNodesInKGroup {
    
    // 链表节点定义
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    // TODO: 实现解决方案
    public ListNode reverseKGroup(ListNode head, int k) {
        // 待实现
        return null;
    }
}