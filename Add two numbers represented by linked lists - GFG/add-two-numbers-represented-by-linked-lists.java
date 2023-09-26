//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node reverse (Node head)
    {
        Node prev =null;
        Node curr = head;
        while (curr!=null)
        {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        Node first1= reverse(first);
        Node second1 = reverse(second);
        int carry =0;
        Node dummy = new Node(0);
        Node temp = dummy;
        while (first1!=null || second1!=null || carry==1)
        {
             int sum =0;
            if(first1!=null)
            {
                sum+= first1.data;
                first1= first1.next;
            }
            if(second1!=null)
            {
                sum+=second1.data;
                second1 = second1.next;
            }
            sum+= carry;
            carry = sum /10;
            Node newnode = new Node(sum%10);
            temp.next = newnode;
            temp = temp.next;
        }
        dummy.next = reverse(dummy.next);
        return dummy.next;
    }  
}