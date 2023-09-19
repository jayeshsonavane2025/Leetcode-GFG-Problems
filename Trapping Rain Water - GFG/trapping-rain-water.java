//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;


class Array {

	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		  
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements to the array
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling trappingWater() function
		    System.out.println(obj.trappingWater(arr, n));
		}
	}
}


// } Driver Code Ends


class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int height[], int n) { 
        // Your code here
        int l = 0,r =height.length - 1, lMax = 0, rMax = 0;
        long sum = 0;
        while(l <= r){
            lMax = Math.max(height[l], lMax);
            rMax = Math.max(height[r], rMax);
			 //why? because, for example if the lMax is smaller, we can sure that how much water could be trapped at the left pointer position is decided by the left side. 
            if(lMax < rMax){
                sum += lMax - height[l++];
            }else{
                sum += rMax - height[r--];
            }
        }
        return sum;
    } 
}


