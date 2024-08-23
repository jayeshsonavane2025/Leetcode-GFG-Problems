//{ Driver Code Starts
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
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static int lenOfLongSubarr (int arr[], int N, int k) {
            int maxlen=0;
            int sum=0;
            HashMap<Integer,Integer>mymap=new HashMap<>();
            
            mymap.put(0,-1);
            for(int i=0;i<N;i++){
                sum =sum+arr[i];
                int rem=sum-k;
                if(mymap.containsKey(rem)){
                    int len=i-mymap.get(rem);
                    maxlen=Math.max(maxlen,len);
                }
                 if(!mymap.containsKey(sum)){
                     mymap.put(sum,i);
                 }
            }
            
            return maxlen;
    }
    
    
}


