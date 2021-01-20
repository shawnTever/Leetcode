import java.util.Stack;

public class offer06_reversePrint {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack();
        ListNode list = head;
        while (list != null) {
            stack.push(list.val);
            list = list.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0; i < size; i++) {
            print[i] = stack.pop();
        }
        return print;
    }
}
