//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends






//User function Template for Java
class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // Create two lists to hold positive and negative numbers
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Split the numbers into the pos and neg lists
        for (int num : arr) {
            if (num >= 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        // Create a new list to hold the rearranged elements
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        
        // Alternate between positive and negative numbers
        while (i < pos.size() && j < neg.size()) {
            ans.add(pos.get(i++));
            ans.add(neg.get(j++));
        }

        // Add remaining positive numbers, if any
        while (i < pos.size()) {
            ans.add(pos.get(i++));
        }

        // Add remaining negative numbers, if any
        while (j < neg.size()) {
            ans.add(neg.get(j++));
        }

        // Copy the rearranged elements back into the original array
        for (int k = 0; k < arr.size(); k++) {
            arr.set(k, ans.get(k));
        }
    }
}