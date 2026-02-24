/**
 * 21. 合并两个有序链表 (Merge Two Sorted Lists)
 * 
 * 题目描述：
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 
 * 示例：
 * 输入：l1 = [1,2,4], l2 = [1,3,4]
 * 输出：[1,1,2,3,4,4]
 * 
 * 输入：l1 = [], l2 = []
 * 输出：[]
 * 
 * 输入：l1 = [], l2 = [0]
 * 输出：[0]
 * 
 * 提示：
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按非递减顺序排列
 */
public class MergeTwoSortedLists {
    
    // 链表节点定义
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    // TODO: 实现解决方案
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 待实现
        return null;
    }
}