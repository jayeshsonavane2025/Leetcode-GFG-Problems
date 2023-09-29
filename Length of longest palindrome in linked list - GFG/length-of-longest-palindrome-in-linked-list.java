//{ Driver Code Starts
import java.util.*;
import java.lang.Math;
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}
class PalindromeLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Node head=null;
			head=insert(head,sc.nextInt());
			for(int i=1;i<n;i++)
				insert(head,sc.nextInt());
			GfG g=new GfG();
			System.out.println(g.maxPalindrome(head));
		}
	}
	public static Node insert(Node head,int val){
		if(head==null)
			return new Node(val);
		head.next=insert(head.next,val);
		return head;
	}
	/*public static void print(Node head){
		while(head!=null){
			System.out.println(head.data);
			head=head.next;
		}
	}*/
}
// } Driver Code Ends


/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node next;
	Node(int d){
		data=d;
		next=null;
	}
}*/
class GfG
{
       public static int maxPalindrome(Node head)
       {
         //add code here.
         Node curr = head;
         Node prev = null;
         
         int ans =0;
         while(curr != null){
             Node next = curr.next;
             curr.next = prev;
             
             // for odd case 2<-3<-4 5 4->3->2
             ans = Math.max(ans, 2*count(prev, next)+1);
             // even
             ans = Math.max(ans, 2*count(curr,next));
             prev = curr;
             curr = next;
             
         }
         return ans;
         
       }
       
       static int count(Node first , Node last){
           Node a = first;
           Node b = last;
           
           int count =0;
           
           while( a!= null && b!=null){
               if(a.data == b.data){
                   a=a.next;
                   b=b.next;
                   
                   // this will iterate line by line 
                   count++;
               }
               else{
                   break;
               }
           }
           return count;
       }
}