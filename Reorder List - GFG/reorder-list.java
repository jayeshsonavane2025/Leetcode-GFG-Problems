//{ Driver Code Starts
import java.util.*;

import java.io.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[])throws IOException {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while (t > 0) {
            int n = Integer.parseInt(in.readLine());
            ReorderList llist = new ReorderList();

            String s[]=in.readLine().trim().split(" ");
            int a1 = Integer.parseInt(s[0]);
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = Integer.parseInt(s[i]);
                llist.addToTheLast(new Node(a));
            }

            new Solution().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}
// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
    public void reorderlist(Node head) {

        //Find the middle node
        Node slow = head, fast = head, prev = null;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the 2nd Half of List, make it a separate list
        Node curr = slow.next;
       slow.next = null;
        while(curr!=null){
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        
        //Merging two Linked Lists
        Node curr1 = head;
        Node curr2 = prev;
        while(curr1!=null && curr2!=null){
            Node next1 = curr1.next;
            Node next2 = curr2.next;
            
            curr1.next = curr2;
            curr2.next = next1;

            curr1 = next1;
            curr2 = next2;
        }
        
    }
}