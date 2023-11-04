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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            String b = input[1];
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a,b));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry += a.charAt(i) - '0';
                i--;
            }
            
            if (j >= 0) {
                carry += b.charAt(j) - '0';
                j--;
            }
            
            ans.append(carry % 2);
            carry = carry / 2;
        }
        
        // Reverse the result
        ans.reverse();
        
        // Remove leading zeros
        while (ans.length() > 1 && ans.charAt(0) == '0') {
            ans.deleteCharAt(0);
        }
        
        return ans.toString();
    }
}
