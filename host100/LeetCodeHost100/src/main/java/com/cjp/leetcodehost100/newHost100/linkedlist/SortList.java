/**
 * 148. 排序链表 (Sort List)
 * 
 * 题目描述：
 * 给你链表的头结点 head，请你将该链表升序排列，并返回排序后的链表。
 * 
 * 示例：
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 * 
 * 输入：head = [-1,5,3,4,0]
 * 输出：[-1,0,3,4,5]
 * 
 * 输入：head = []
 * 输出：[]
 * 
 * 提示：
 * 链表中节点的数目在范围 [0, 5 * 10^4] 内
 * -10^5 <= Node.val <= 10^5
 * 
 * 进阶：你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
 */
public class SortList {
    
    // 链表节点定义
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    // TODO: 实现解决方案
    public ListNode sortList(ListNode head) {
        // 待实现
        return null;
    }
}