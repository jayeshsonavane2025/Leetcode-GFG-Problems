//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.stringFilter(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public String stringFilter(String str) 
    {
        // Your code goes here
        int n=str.length();
        String s="";
        int l=0;
        while(l<n){
            if(str.charAt(l)=='b'){
                l++;
            }
            else if(str.charAt(l)=='a' && l+1 < n && str.charAt(l+1)=='c' ){
                l+=2;
            }
            else{
                s+=str.charAt(l);
                l++;
            }
        }
        return s;
    }
}