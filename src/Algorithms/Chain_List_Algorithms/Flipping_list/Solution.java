package Algorithms.Chain_List_Algorithms.Flipping_list;


/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:31 2019/6/9
 */
public class Solution {


    public ListNode ReverseList(ListNode head) {

        ListNode next = null;
        ListNode pre = null;

        while (head != null) {
            // 保存要反转到头的那个节点
            next = head.next;
            // 要反转的那个节点指向已经反转的上一个节点(备注:第一次反转的时候会指向null)
            head.next = pre;
            // 上一个已经反转到头部的节点
            pre = head;
            // 一直向链表尾走
            head = next;
        }
        return pre;
    }


//    public static void main(String[] args) {
////            ListNode l1 = new ListNode(1);
////        ListNode l2 = new ListNode(2);
////        ListNode l3 = new ListNode(3);
////
////        l1.next = l2;
////
////        l2.next = l3;
////
////        ListNode h = reverseList(l1);
////
////        while (h != null) {
////
////            System.out.println(h.val);
////
////            h.next = h;
////        }
////
////
////
////
////
////    }


}
