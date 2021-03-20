public class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public String toString() {
        if (next == null) {
            return Integer.toString(val);
        } else {
            return Integer.toString(val) + next;
        }
    }
}
