/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
       if(head==null)return false;
       Set<ListNode> set=new HashSet<>();
       while(head.next != null){
           if(! set.add(head)){
               return true;
           }
           head=head.next;
       }
        return false;
       
    }
}