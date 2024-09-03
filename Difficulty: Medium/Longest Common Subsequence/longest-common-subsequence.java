//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt(); // Take size of both the strings as input
            int m = sc.nextInt();

            String str1 = sc.next(); // Take both the string as input
            String str2 = sc.next();

            Solution obj = new Solution();

            System.out.println(obj.lcs(n, m, str1, str2));
        }
    }
}
// } Driver Code Ends









class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    int lcs(int x, int y, String s1, String s2)
    {
        int dp[][] = new int[x + 1][y + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        return function(0, 0, s1, s2, dp);
    }
    
    public int function(int a, int b, String s1, String s2, int dp[][]) {
        if (dp[a][b] != -1) {
            return dp[a][b];
        }
        if (a == s1.length() || b == s2.length()) {
            return 0;
        }
        if (s1.charAt(a) == s2.charAt(b)) {
            return dp[a][b]= 1 + function(a + 1, b + 1, s1, s2, dp);
             
        }
       
         return dp[a][b]= Math.max(function(a, b + 1, s1, s2, dp),function(a + 1, b, s1, s2, dp));
         
    }
    
}