//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-- > 0) {
			int N = sc.nextInt();
			Solution obj = new Solution();
			obj.toBinary(N);
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
	void toBinary(int n) {
		//Write your code here
	String ans="";
    while(n!=0){
      if((n & 1) != 0){
        ans='1'+ans;
      }
      else{
        ans='0'+ans;
      }
      n>>=1;
    } 
    System.out.print(ans);
	}
}