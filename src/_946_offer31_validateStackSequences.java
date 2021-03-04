import java.util.Stack;

public class _946_offer31_validateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int i = 0;
        Stack<Integer> stack = new Stack<>();
        for (int push : pushed) {
            stack.push(push);
            while (!stack.isEmpty() && popped[i] == stack.peek()) {
                stack.pop();
                i++;
            }
        }
        if (stack.isEmpty()) return true;
        else return false;
    }
}
