/**
 * 19. 删除链表的倒数第 N 个结点 (Remove Nth Node From End of List)
 * 
 * 题目描述：
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 
 * 示例：
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 
 * 输入：head = [1], n = 1
 * 输出：[]
 * 
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * 
 * 提示：
 * 链表中节点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 * 
 * 进阶：你能尝试使用一趟扫描实现吗？
 */
public class RemoveNthFromEnd {
    
    // 链表节点定义
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    // TODO: 实现解决方案
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 待实现
        return null;
    }
}