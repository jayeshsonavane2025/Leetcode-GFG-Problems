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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode mainCurr = head;
        
        ListNode dummyNode = new ListNode();
        ListNode newCurr = dummyNode;
        
        while(mainCurr != null){
            ListNode curr = mainCurr; 
            int i = k;
            int availableNode = 0;
            while(i --> 0 && curr != null){
                curr = curr.next;
                availableNode++;
            }
            ListNode nextGroupFirstNode = curr; 
            if(availableNode == k){
                newCurr.next = getReverseFirstKNodes(mainCurr, k);
                newCurr = mainCurr;
            }else{
                newCurr.next = mainCurr;
            }
             
            mainCurr = nextGroupFirstNode;
        }
        
        return dummyNode.next;
    } 
    private ListNode getReverseFirstKNodes(ListNode node, int k){
        ListNode prev = null;
        ListNode curr = node;
        
        while(curr != null && k --> 0){
            ListNode next = curr.next;
            
            curr.next = prev;
            prev = curr;
            
            curr = next;
        }

        return prev;
    }

    
}