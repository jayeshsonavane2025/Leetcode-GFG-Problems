//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
class duplicates
{
    Node head;  
    Node tail;
	public void addToTheLast(Node node) 
	{
	  if (head == null) 
	  {
	   head = node;
	   tail = node;
	  } 
	  else 
	  {
	   tail.next = node;
	   tail = node;
	  }
	}
      void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	/* Drier program to test above functions */
	public static void main(String args[])
    {
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();
		 while(t>0)
         {
			int N = sc.nextInt();
			duplicates llist = new duplicates(); 
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) 
			{
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
			
        Solution ob = new Solution();
		head = ob.removeAllDuplicates(llist.head);
		llist.printList(head);
		
        t--;		
        }
    }
    
}
// } Driver Code Ends


//User function Template for Java

/* Linked List Node class

class Node
{
    int data;
    Node next;
}
    
*/
class Solution
{
    public static Node removeAllDuplicates(Node head)
    {
        //code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        Node curr=head;
        while(curr!=null){
            if(hm.containsKey(curr.data)){
                hm.put(curr.data,hm.get(curr.data)+1);
            }else{
                hm.put(curr.data,1);
            }
            curr=curr.next;
        }
        
        Node newNode=new Node(-1);
        Node n=newNode;
        curr=head;
        while(curr!=null){
            if(hm.get(curr.data) == 1){
                n.next=curr;
                n=n.next;
            }
            curr=curr.next;
        }
        n.next=null;
        return newNode.next;
    }
}