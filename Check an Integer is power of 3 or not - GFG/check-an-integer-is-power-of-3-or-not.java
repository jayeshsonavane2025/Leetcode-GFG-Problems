//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isPowerof3(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String isPowerof3(int n){
        // code here
        int temp=1;
        while(n>1 && temp<n)
             temp+=(temp<<1);
        return temp==n?"Yes":"No";
    }
}