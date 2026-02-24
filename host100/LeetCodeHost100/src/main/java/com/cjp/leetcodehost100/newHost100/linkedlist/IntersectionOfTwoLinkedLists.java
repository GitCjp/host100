/**
 * 160. 相交链表 (Intersection of Two Linked Lists)
 * 
 * 题目描述：
 * 给你两个单链表的头节点 headA 和 headB，请你找出并返回两个单链表相交的起始节点。
 * 如果两个链表不存在相交节点，返回 null。
 * 
 * 示例：
 * 输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
 * 输出：Intersected at '8'
 * 
 * 输入：intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * 输出：Intersected at '2'
 * 
 * 输入：intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * 输出：null
 * 
 * 提示：
 * listA 中节点数目为 m
 * listB 中节点数目为 n
 * 1 <= m, n <= 3 * 10^4
 * 1 <= Node.val <= 10^5
 * 0 <= skipA <= m
 * 0 <= skipB <= n
 * 如果 listA 和 listB 没有交点，intersectVal 为 0
 * 如果 listA 和 listB 有交点，intersectVal == listA[skipA] == listB[skipB]
 */
public class IntersectionOfTwoLinkedLists {
    
    // 链表节点定义
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    
    // TODO: 实现解决方案
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 待实现
        return null;
    }
}