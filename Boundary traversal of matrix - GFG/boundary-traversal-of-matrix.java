//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        
        while(t-- > 0)
        {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            s = in.readLine().trim().split(" ");
            int ind=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[ind++]);
                }
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.boundaryTraversal(a, n, m);
            for (int i : ans) {
                out.print(i + " ");
            }
            out.println();
        }
        out.close();
    }
}
// } Driver Code Ends

 class Solution {
    static ArrayList<Integer> boundaryTraversal(int a[][], int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();

        if (n == 1) {
            for (int j = 0; j < m; j++) {
                list.add(a[0][j]);
            }
        } else if (m == 1) {
            for (int i = 0; i < n; i++) {
                list.add(a[i][0]);
            }
        } else {
            // Traverse the top row
            for (int j = 0; j < m; j++) {
                list.add(a[0][j]);
            }

            // Traverse the rightmost column
            for (int i = 1; i < n; i++) {
                list.add(a[i][m - 1]);
            }

            // Traverse the bottom row
            for (int j = m - 2; j >= 0; j--) {
                list.add(a[n - 1][j]);
            }

            // Traverse the leftmost column
            for (int i = n - 2; i >= 1; i--) {
                list.add(a[i][0]);
            }
        }
        
        return list;
    }
}
