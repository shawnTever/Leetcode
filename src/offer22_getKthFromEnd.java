public class offer22_getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head;
        ListNode quick = head;
        for (int i = 0; i < k; i++) {
            quick = quick.next;
        }
        while (quick != null) {
            slow = slow.next;
            quick = quick.next;
        }
        return slow;
    }
}
