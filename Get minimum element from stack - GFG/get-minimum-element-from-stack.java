//{ Driver Code Starts
import java.util.*;



class Get_Min_From_Stack
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int q = sc.nextInt();
			GfG g = new GfG();
			while(q>0)
			{
				int qt = sc.nextInt();
				
				if(qt == 1)
				{
					int att = sc.nextInt();
					g.push(att);
					//System.out.println(att);
				}
				else if(qt == 2)
				{
					System.out.print(g.pop()+" ");
				}
				else if(qt == 3)
				{
					System.out.print(g.getMin()+" ");
				}
			
			q--;
			}
			System.out.println();
		T--;
		}
		
	}
}



// } Driver Code Ends



class GfG
{
    int minEle;
    Stack<Integer> s;
    Stack<Integer> minStack;
    // Constructor    
    GfG()
	{

         s = new Stack<Integer>();
        minStack = new Stack<Integer>();
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	 if(s.empty()) return -1;
	    return minStack.peek();
	     
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	 if(s.empty()) return -1;
	    minStack.pop();
	    return s.pop();
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
	 int min = s.empty() ? x : Math.min(x, this.getMin());        
	    s.push(x);
	    minStack.push(min);
    }	
}