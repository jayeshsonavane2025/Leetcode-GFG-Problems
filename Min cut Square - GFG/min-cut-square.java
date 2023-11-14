//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int m = sc.nextInt();
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCut(m,n));
                }
        }
}    
// } Driver Code Ends


class Solution
{
    void swap(int a,int b)
{
    int temp = a;
    a = b;
    b = temp;
}
	public int minCut(int n, int m)
	{
        // Your code goes here
        int[][] dp = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = Integer.MAX_VALUE;
                    for (int k = 1; k < i; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i-k][j] + dp[k][j]);
                    }
                    for (int k = 1; k < j; k++) {
                        dp[i][j] = Math.min(dp[i][j], dp[i][j-k] + dp[i][k]);
                    }
                }
            }
        }
        return dp[n][m];
	}
}