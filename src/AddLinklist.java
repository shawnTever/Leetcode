import org.junit.Test;

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class ListNode{
    int val;
    ListNode next;
    public ListNode(int x) { val = x; }

    @Override
    public String toString() {
        if (next == null) {
            return Integer.toString(val);
        }
        else {
            return Integer.toString(val) + next;
        }
    }
}

public class AddLinklist {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2, first = null, last = null;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null)? p.val : 0;
            int y = (q != null)? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            
            if (first == null) {
                first = last = new ListNode(sum % 10);
            }
            else {
                last.next = new ListNode(sum % 10);
                last = last.next;
            }

            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
            }

        }

        return first;
    }

    public static void main(String[] args) {
//        LinkedList<Integer> ll = new LinkedList<>();
//        ll.add(3);
//        ll.add(4);
//        ll.add(5);
//        int g = ll.get(1);
//        System.out.println("ll: " + ll);
//        System.out.println("get: " + g);


        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);
        System.out.println("l1: " + l1 );
        System.out.println("l2: " + l2);
        AddLinklist l = new AddLinklist();
        ListNode l3 = l.addTwoNumbers(l1, l2);
        System.out.println("l3: " + l3);

    }

}
