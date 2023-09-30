//{ Driver Code Starts
import java.util.*;
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} 

class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int a = sc.nextInt();
            Node head = new Node(a);
            Node tail = head;
            
            for (int i=0; i<n-1; i++)
            {
                a = sc.nextInt();
                tail.next = new Node(a);
                tail = tail.next;
            }
            
            int k = sc.nextInt();
            
            Solution ob = new Solution();
            head = ob.rotate(head,k);
            printList(head);
        }
    }
    
    public static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        Node curr = head;
        int len = 1;
        
        // Find the length of the linked list.
        while (curr.next != null) {
            len++;
            curr = curr.next;
        }
        
        // Connect the last node to the head to make it circular.
        curr.next = head;
        
        // Calculate the effective rotation count (k modulo len).
        k = k % len;
        
        // Find the new head by moving 'len - k' steps forward.
        for (int i = 0; i <  k; i++) {
            curr = curr.next;
        }
        
        // Update the head and break the circular connection.
         Node newHead = curr.next;
        curr.next = null;
        
        return newHead;
    }
}