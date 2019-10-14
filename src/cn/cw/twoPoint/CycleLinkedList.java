package cn.cw.twoPoint;

/**
 * created by coffeecw 2019/10/14
 * 141. 环形链表
 */
public class CycleLinkedList {
    public boolean hasCycle(ListNode head){
        if(head == null || head.next == null){//空链表和一个节点的链表
            return false;
        }
        ListNode slow = head;//慢指针
        ListNode fast = head;//快指针
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

}
class ListNode {
      int val;
      ListNode next;
     ListNode(int x) {
          val = x;
          next = null;
      }
  }
