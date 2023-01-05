/**
 * 426. 二叉搜素树与双向链表
 */


public class TreeToDoublyList {
    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    };

    Node pre=null, head=null;

    public Node treeToDoublyList(Node root) {
        if(root==null){
            return null;
        }

        dp(root);
        pre.right=head;
        head.left=pre;

        return head;
    }

    void dp(Node root){
        if(root==null){
            return;
        }

        dp(root.left);
        if(pre!=null){
            pre.right = root;
        }else{
            head = root;
        }
        root.left = pre;
        pre = root;
        dp(root.right);
    }

}
