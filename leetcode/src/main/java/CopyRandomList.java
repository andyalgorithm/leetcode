import java.util.HashMap;

public class CopyRandomList {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }

        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;

        // 1. 复制各节点，并建立 “原节点 -> 新节点” 的 Map 映射
        while (cur!=null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        // 2. 构建新链表的 next 和 random 指向
        while (cur!=null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        // 3. 返回新链表的头节点
        return map.get(head);
    }
}
