//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int N = Integer.parseInt(element[0]);
		    int M = Integer.parseInt(element[1]);
		   
		    
		    Complete obj = new Complete();
		    int ans = obj.common_divisor(N, M);
		    System.out.println(ans);
		}
	}
}




// } Driver Code Ends


//User function Template for Java


class Complete{
    
    // Function for finding maximum and value pair
    public static int common_divisor (int n, int m) {
        //Complete the function
        int min=Math.min(n,m);
        int commonDiv=0;
        for(int i=1;i<=min;i++){
            if(n%i==0 && m%i==0){
                commonDiv++;
            }
        }
        return commonDiv;
    }
     
}