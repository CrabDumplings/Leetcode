class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class SameNode {
    /*
    * 链表A的长度为l1
    * 链表B的长度为l2
    * 除去两个链表相同的部分，A的长度为n1，B的长度为n2
    * 两个链表的公共长度为C
    *
    * l1 = n1 + C
    * l2 = n2 + C
    
    * 两个链表都走一遍，走的长度是相同的
    * */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null)
            return null;
        ListNode node1 = headA;
        ListNode node2 = headB;
        while(node1 != node2){
            //判断node1是否为空，为空，node1 = headB，不为空，转为下一个元素
            node1 = node1 == null ? headB : node1.next;
            node2 = node2 == null ? headA : node2.next;
        }
        return node1;
    }
}
