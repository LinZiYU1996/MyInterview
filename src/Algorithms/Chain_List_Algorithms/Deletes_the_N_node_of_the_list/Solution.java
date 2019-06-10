package Algorithms.Chain_List_Algorithms.Deletes_the_N_node_of_the_list;

/**
 * @Author: Mr.Lin
 * @Description:
 * @Date: Create in 21:12 2019/6/10
 */
public class Solution {

//两次遍历法
//
//首先我们将添加一个 哑结点 作为辅助，该结点位于列表头部。哑结点用来简化某些极端情况，例如列
// 表中只含有一个结点，或需要删除列表的头部。在第一次遍历中，我们找出列表的长度 L。然后设置一个指向哑结点的指针，
// 并移动它遍历列表，直至它到达第 (L - n) 个结点那里。我们把第 (L - n)个结点的 next 指针重新链接至第 (L - n + 2)个结点，完成这个算法。


    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 哑结点，哑结点用来简化某些极端情况，例如列表中只含有一个结点，或需要删除列表的头部
        ListNode dummy = new ListNode(0);
        // 哑结点指向头结点
        dummy.next = head;
        // 保存链表长度
        int length = 0;
        ListNode len = head;
        while (len != null) {
            length++;
            len = len.next;
        }
        length = length - n;
        ListNode target = dummy;
        // 找到 L-n 位置的节点
        while (length > 0) {
            target = target.next;
            length--;
        }
        // 把第 (L - n)个结点的 next 指针重新链接至第 (L - n + 2)个结点
        target.next = target.next.next;
        return dummy.next;
    }


    //复杂度分析：
    //
    //时间复杂度 O(L) ：该算法对列表进行了两次遍历，首先计算了列表的长度 LL 其次找到第 (L - n)(L−n) 个结点。 操作执行了 2L-n2L−n 步，时间复杂度为 O(L)O(L)。
    //空间复杂度 O(1) ：我们只用了常量级的额外空间。




    //进阶——一次遍历法：
    //
    //**链表中倒数第N个节点也就是正数第(L-N+1)个节点。
    //
    //其实这种方法就和我们上面第四题找“链表中倒数第k个节点”所用的思想是一样的。基本思路就是： 定义两个节点 node1、node2;node1 节点先跑，node1节点 跑到第 n+1 个节点的时候,node2 节点开始跑.当node1 节点跑到最后一个节点时，node2 节点所在的位置就是第 （L-n ） 个节点（L代表总链表长度，也就是倒数第 n+1 个节点）


    public ListNode removeNthFromEnd1(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // 声明两个指向头结点的节点
        ListNode node1 = dummy, node2 = dummy;

        // node1 节点先跑，node1节点 跑到第 n 个节点的时候,node2 节点开始跑
        // 当node1 节点跑到最后一个节点时，node2 节点所在的位置就是第 （L-n ） 个节点，也就是倒数第 n+1（L代表总链表长度）
        while (node1 != null) {
            node1 = node1.next;
            if (n < 1 && node1 != null) {
                node2 = node2.next;
            }
            n--;
        }

        node2.next = node2.next.next;

        return dummy.next;

    }










}
