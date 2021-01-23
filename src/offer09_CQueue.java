import java.util.LinkedList;

public class offer09_CQueue {

    LinkedList<Integer> stack1, stack2;
    public offer09_CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) return -1;
            else {
                while (!stack1.isEmpty()) {
                    stack2.add(stack1.pop());
                }
                return stack2.pop();
            }
        } else return stack2.pop();
    }

}
