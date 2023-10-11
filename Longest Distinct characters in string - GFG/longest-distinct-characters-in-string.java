//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String s){
        // code here
        ArrayDeque<Character> q=new ArrayDeque<>();

        int maxLength=Integer.MIN_VALUE;

        for(char ch:s.toCharArray()){
          while(q.contains(ch)){
            q.poll();
          }
          q.offer(ch);
          maxLength=Math.max(maxLength,q.size());
        }
        return maxLength;
        
    }
}