import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class offer18_deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = head;
        if (head.val== val) return head.next;
        while (p.next != null && p.next.val != val) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}
