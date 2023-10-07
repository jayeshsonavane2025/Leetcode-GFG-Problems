//{ Driver Code Starts
import java.util.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] inputline = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputline[0]);
            inputline = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputline[i]);
            }
            Solution ob =new Solution();
            int[] res = ob.maxOfMin(arr, n);
            
            for (int i = 0; i < n; i++) 
                System.out.print (res[i] + " ");
            System.out.println ();
        }
    }
}
// } Driver Code Ends


class Solution 
{
    //Function to find maximum of minimums of every window size.
    static int[] maxOfMin(int[] arr, int n) 
    {
        // Your code here
        int nser[]=new int[n];
        int nsel[]=new int[n];
        right(arr,nser);
        left(arr,nsel);
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int si=nsel[i];
            int ei=nser[i];
            ans[ei-si-2]=Math.max(ans[ei-si-2],arr[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            ans[i]=Math.max(ans[i],ans[i+1]);
        }
        return ans;
    }
    static void right(int a[],int []nser)
    {
        Stack<Integer>st=new Stack<>();
        nser[a.length-1]=a.length;
        st.push(a.length-1);
        for(int i=a.length-2;i>=0;i--)
        {
            while(st.size()>0&&a[st.peek()]>=a[i])
            {
                st.pop();
            }
            if(st.size()==0) nser[i]=a.length;
            else nser[i]=st.peek();
            st.push(i);
        }
    }
     static void left(int a[],int []nsel)
    {
        Stack<Integer>st=new Stack<>();
        nsel[0]=-1;
        st.push(0);
        for(int i=1;i<a.length;i++)
        {
            while(st.size()>0&&a[st.peek()]>=a[i])
            {
                st.pop();
            }
            if(st.size()==0) nsel[i]=-1;
            else nsel[i]=st.peek();
            st.push(i);
        }
    }
    
}