//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String arr[] = in.readLine().trim().split("\\s+");
            long A[] = new long[N];
            for(int i = 0; i < N; i++)
                A[i] = Long.parseLong(arr[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.countBits(N, A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int countBits(int n, long a[])
    {
        // code here
        long ans=0;
       
        long m=1000000007;
        for(int i=0;i<32;i++){
          long cnt=0;
          for(long item:a){
            if((item & (1<<i))!=0){
              cnt++;
            }
          }
          ans=(int)(ans%m+(cnt*(n-cnt)*2)%m);
        } 
        return (int)(ans%m);
    }
}