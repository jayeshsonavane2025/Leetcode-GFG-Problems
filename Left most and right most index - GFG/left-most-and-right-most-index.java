//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        
        long first=firstOcc(v,x);
        long second=lastOcc(v,x);
        pair ans=new pair(first,second);
        return ans;
        
    }
    public static long firstOcc(long[] a,long k){
        int l=0,r=a.length-1;
        long ans=-1;
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
    public static long lastOcc(long[] a,long k){
        int l=0,r=a.length-1;
        long ans=-1;
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