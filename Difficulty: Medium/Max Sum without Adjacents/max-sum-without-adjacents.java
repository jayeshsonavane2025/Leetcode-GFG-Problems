//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    
    static int f(int ind , int[] dp,int[] arr){
        
        //Base case 
        if(ind<0) return 0;
        if(ind==0) return arr[ind];
        
        //if the result is alrady calc we avoid overlappin subproblem 
        if(dp[ind]!=-1) return dp[ind];
        
        //if not calculate the max sum by picking or not 
        int pick=arr[ind] + f(ind-2,dp,arr);
        int notpick=0+ f(ind-1,dp,arr);
        
        return dp[ind]=Math.max(pick,notpick);
        
    }
    int findMaxSum(int arr[], int n) {
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return f(n-1,dp,arr);
    }
}