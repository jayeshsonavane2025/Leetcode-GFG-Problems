//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    int n = Integer.parseInt(br.readLine());
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    ArrayList<Integer> v;
		    v = obj.countFreq(arr,n);
            for(int i : v)
                System.out.print(i+" ");
		    System.out.println();
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public ArrayList<Integer> countFreq(int[] a, int n)  
    { 
  
        // complete the function
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(a);

        int val = a[0];
        for(int i=1; i<n; i++){
            if(a[i] != val){
                ans.add(i);
                val = a[i];
            }
        }
        ans.add(n);
        return ans;
    }  
      
}

