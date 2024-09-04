//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.nthStair(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public long nthStair(int n)
    {
        return n/2 + 1;
    }
    // public long nthStair(int n) {
    //     // Code here
    //     int ans = 0;
    //     if(n%2 == 0){
    //       while(n>0){
    //         ans += 1;
    //         n -= 2;
    //     } 
    //         return ans+1;
    //     }
    //     while(n>0){
    //         ans += 1;
    //         n -= 2;
    //     }
    //     return ans;
    // }
}

