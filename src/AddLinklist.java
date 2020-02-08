import org.junit.Test;

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
    public String toString(){
        if (next == null) {
            return Integer.toString(val);
        }
        else {
            return Integer.toString(val) + next;
        }
    }
}

public class AddLinklist {
    ListNode first, last;

    public void add(int i){
        if (first == null) {
            first = last = new ListNode(i);
        }
        else {
            last.next = new ListNode(i);
            last = last.next;
        }
    }

    @Override
    public String toString() {
        if (first == null) {
            return " ";
        }
        else {
            return first.toString();
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return l1;
    }

    public static void main(String[] args) {
        AddLinklist l1 = new AddLinklist();
        AddLinklist l2 = new AddLinklist();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        l2.add(5);
        l2.add(6);
        l2.add(4);
        System.out.println("l1: " + l1 );
        System.out.println("l2: " + l2);

    }

}
