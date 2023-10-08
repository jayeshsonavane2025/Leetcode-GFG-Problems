//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.shortestUnorderedSubarray(a, n));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java 
class Solution {
    
    public long shortestUnorderedSubarray(long arr[], long n)
    {
        if(n<3){
            return 0;
        }
        if(increasing(arr))
           return 0;
        if(decreasing(arr)){
            return 0;
        }else{
            return 3;
        }
        
        
    }
    
    public static boolean increasing(long arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
          return true;
    }
    
    public static boolean decreasing(long arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                return false;
            }
        }
          return true;
    }
}