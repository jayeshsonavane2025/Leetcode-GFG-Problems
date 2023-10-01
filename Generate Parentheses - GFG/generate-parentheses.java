//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> list=new ArrayList<String>();
        solve(list,n,"",0,0,0); 
        return list;
    }
    public static void solve(List<String> list,int n,String str,int i,int open,int close){
      if(i==2*n){
        list.add(str);
      }
      if(open<n){
        str=str+'(';
        solve(list,n,str,i+1,open+1,close);
        str=str.substring(0,str.length()-1);
      }
      if(close<open){
        str=str+')';
        solve(list,n,str,i+1,open,close+1);
        str=str.substring(0,str.length()-1);
      }
    }
}