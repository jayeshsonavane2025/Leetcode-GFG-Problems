//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().maxSortedAdjacentDiff(a, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution {
    int maxSortedAdjacentDiff(int[] arr, int n) {
        // code here
       
      if(n<2)return 0;
      Arrays.sort(arr);
      int max=Integer.MIN_VALUE;
      for(int i=0;i<arr.length-1;i++){
        max=Math.max(max,arr[i+1]-arr[i]);
      }
      return max;
    }
}