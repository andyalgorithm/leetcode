package linkedList.doublePointer;

/*
2. 两数相加
 */

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 两个链表上的两个指针
        ListNode p1 =l1 , p2=l2;

        // 虚拟节点（构建新链表时的常用技巧）
        ListNode dummy = new ListNode(-1);

        // 负责构建新链表
        ListNode p = dummy;

        // 进位符号
        int carry=0;

        while(p1!=null || p2!=null || carry>0) {
            int val = carry;
            carry = 0;
            if(p1!=null) {
                val += p1.val;
                p1 = p1.next;
            }
            if(p2!=null) {
                val += p2.val;
                p2 = p2.next;
            }
            if (val>9) {
                val -= 10;
                carry = 1;
            }
            p.next = new ListNode(val);
            p = p.next;
        }

        return dummy.next;


    }
}
