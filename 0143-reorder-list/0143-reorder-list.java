/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {

        //Find the middle node
        ListNode slow = head, fast = head, prev = null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the 2nd Half of List, make it a separate list
        ListNode curr = slow.next;
       slow.next = null;
        while(curr!=null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        //Merging two Linked Lists
        ListNode curr1 = head;
        ListNode curr2 = prev;
        while(curr1!=null && curr2!=null){
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;
            
            curr1.next = curr2;
            curr2.next = next1;

            curr1 = next1;
            curr2 = next2;
        }
        
    }
}