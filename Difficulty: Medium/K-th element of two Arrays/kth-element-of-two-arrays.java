//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] arr1 = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                arr1[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] arr2 = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                arr2[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(k, arr1, arr2));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        ArrayList <Integer> list =new ArrayList <>();//Created new Arraylist to store arr1 and arr2 elements
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);//added arr1 elements to the list
        }
        for(int i=0;i<arr2.length;i++){
            list.add(arr2[i]);//added arr2 elements to the list
        }
        Collections.sort(list);//Sorted the list
        return list.get(k-1);//kth element = k-1 index
    }
}