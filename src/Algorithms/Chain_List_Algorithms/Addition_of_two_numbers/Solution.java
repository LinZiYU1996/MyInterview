package Algorithms.Chain_List_Algorithms.Addition_of_two_numbers;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:26 2019/6/9
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);

        ListNode p = l1, q = l2, curr = dummyHead;

        //carry 表示进位数
        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            //进位数
            carry = sum / 10;
            //新节点的数值为sum % 10
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;



    }




}
