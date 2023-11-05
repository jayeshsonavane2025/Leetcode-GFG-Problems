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
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int fo=firstOcc(arr,x);
        int lo=lastOcc(arr,x);
        if(fo==-1)return 0;
        else{
            return lo-fo+1;
        }
    }
    public static int firstOcc(int[] a,int k){
        int l=0,r=a.length-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(k<a[m]){
                r=m-1;
                
            }
            else if(k>a[m]){
                l=m+1;
            }
            else{
                r=m-1;
                ans=m;
            }
        }
        return ans;
    }
    public static int lastOcc(int[] a,int k){
        int l=0,r=a.length-1;
        int ans=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(k<a[m]){
                r=m-1;
            }
            else if(k>a[m]){
                l=m+1;
            }
            else{
                l=m+1;
                ans=m;
            }
        }
        return ans;
    }
}

