import java.util.HashMap;
import java.util.Map;

public class _138_offer35_copyRandomList {
    Map<Node, Node> map = new HashMap<>();
    public Node copyRandomList(Node head) {
        Node p = head;
        if(head == null) {
            return null;
        }
        while (p != null) {
            Node newNode = new Node(p.val);
            map.put(p, newNode);
            p = p.next;
        }
        p = head;
        while (p != null) {
            Node newNode = map.get(p);
            if (p.next != null)
                newNode.next = map.get(p.next);
            if (p.random != null)
                newNode.random = map.get(p.random);
            p = p.next;
        }
        return map.get(head);
    }
}
