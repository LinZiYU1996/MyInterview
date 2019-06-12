package Algorithms.Chain_List_Algorithms.Merge_two_sorted_linked_lists;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 22:21 2019/6/10
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            return null;
    }

    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
        }else{
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }



}
