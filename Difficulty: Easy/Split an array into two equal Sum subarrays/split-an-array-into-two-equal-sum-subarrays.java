//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] s = br.readLine().trim().split(" ");

            int[] arr = new int[s.length];
            for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(s[i]);

            Solution obj = new Solution();
            boolean res = obj.canSplit(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public boolean canSplit(int arr[]) {
        int n=arr.length;
        int[] suffix=new int[n];
        int sum=0;
        for(int i=n-1;i>0;i--){
            sum+=arr[i];
            suffix[i]=sum;
        }
        sum=0;
        for(int i=0;i<n-1;i++){
            sum+=arr[i];
            if(sum==suffix[i+1])
            return true;
        }
        return false;
    }
}
