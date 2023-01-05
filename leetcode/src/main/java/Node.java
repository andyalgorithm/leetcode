import java.util.LinkedList;

public class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }

    public static Node numsToNode(int[] nums) {
        Node dummy = new Node(-1);
        Node curr = dummy;
        for(int n: nums) {
            curr.next = new Node(n);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static LinkedList nodeToLinkedList(Node head) {
        LinkedList<Integer> res = new LinkedList<>();
        while ((head!=null)) {
            res.add(head.val);
            head = head.next;
        }
        return res;
    }
}

