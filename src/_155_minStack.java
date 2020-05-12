import java.util.Stack;

public class _155_minStack {

        /** initialize your data structure here. */
        private Stack<Integer> dataStack;
        private Stack<Integer> minStack;
        public _155_minStack() {
            dataStack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            dataStack.push(x);
            if (minStack.isEmpty() || (x <= minStack.peek() && !minStack.isEmpty())) {
                minStack.push(x);
            }
        }

        public void pop() {
            if (!dataStack.isEmpty()) {
                int data = dataStack.pop();
                if (!minStack.isEmpty() && data == minStack.peek()) {
                    minStack.pop();
                }
            }
        }

        public int top() {
            return dataStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }


    public static void main(String[] args) {
        _155_minStack minStack = new _155_minStack();
        minStack.push(1);
    }

}
