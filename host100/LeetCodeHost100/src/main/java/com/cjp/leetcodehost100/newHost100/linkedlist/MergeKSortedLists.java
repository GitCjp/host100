/**
 * 23. 合并 K 个升序链表 (Merge k Sorted Lists)
 * 
 * 题目描述：
 * 给你一个链表数组，每个链表都已经按升序排列。
 * 请你将所有链表合并成一个升序链表，并返回合并后的链表。
 * 
 * 示例：
 * 输入：lists = [[1,4,5],[1,3,4],[2,6]]
 * 输出：[1,1,2,3,4,4,5,6]
 * 解释：链表数组如下：
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 将它们合并到一个有序链表中得到：
 * 1->1->2->3->4->4->5->6
 * 
 * 输入：lists = []
 * 输出：[]
 * 
 * 输入：lists = [[]]
 * 输出：[]
 * 
 * 提示：
 * k == lists.length
 * 0 <= k <= 10^4
 * 0 <= lists[i].length <= 500
 * -10^4 <= lists[i][j] <= 10^4
 * lists[i] 按 升序 排列
 * lists[i].length 的总和不超过 10^4
 */
public class MergeKSortedLists {
    
    // 链表节点定义
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    // TODO: 实现解决方案
    public ListNode mergeKLists(ListNode[] lists) {
        // 待实现
        return null;
    }
}