package dataStructureDesign;

import linkedList.doublePointer.ListNode;
import org.w3c.dom.NodeList;

/**
 * 146 LRU 缓存机制
 */


class Node {
    int key;
    int val;
    Node next;
    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

// 使用单链表来处理
public class LRUCache {

    private int capacity;
    private int size = 0;
    Node dummy = new Node(-1, -1);

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Node pre = dummy;
        Node cur = pre.next;
        while (cur!=null) {
            if(cur.key==key) {
                moveCurrentNode(pre, cur);
                return cur.val;
            }
            pre = pre.next;
            cur = pre.next;
        }
        return -1;

    }

    public void put(int key, int value) {

        Node pre =dummy;
        Node cur = dummy.next;

        // 先遍历，数据是否存在
        while (cur!=null) {
            if(cur.key==key) {
                cur.val = value;
                moveCurrentNode(pre, cur);
                return;
            }
            cur = cur.next;
            // 保留倒数第二个节点
            if(cur!=null) {
                pre = pre.next;
            }
        }

        // 若数据不存在，那么添加数据
        Node head = dummy.next;
        dummy.next = new Node(key, value);
        dummy.next.next = head;
        // 节点数自增1
        size++;
        if(size>capacity) {
            pre.next = null;
            size = capacity;
        }

    }

    void moveCurrentNode(Node pre, Node cur) {
        pre.next = cur.next;
        cur.next = dummy.next;
        dummy.next = cur;
    }


}
