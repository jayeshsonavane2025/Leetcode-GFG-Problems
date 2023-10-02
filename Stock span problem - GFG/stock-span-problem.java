//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}
// } Driver Code Ends


class Solution
{
    // Function to calculate the span of stocks price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arr[i] = i + 1; // If the stack is empty, the span is the current day + 1
            } else {
                arr[i] = i - st.peek();
            }
            st.push(i); // Push the current day onto the stack
        }
        
        return arr;
    }
}