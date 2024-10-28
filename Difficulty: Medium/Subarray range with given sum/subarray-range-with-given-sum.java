//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {
    static int subArraySum(int arr[], int tar) {
        int n = arr.length;
        int curr_sum = 0;
        int count = 0;
        HashMap<Integer, Integer> sum_freq = new HashMap<>();

        sum_freq.put(0, 1);

        for (int i = 0; i < n; i++) {
            curr_sum += arr[i];

            if (sum_freq.containsKey(curr_sum - tar)) {
                count += sum_freq.get(curr_sum - tar);
            }

            sum_freq.put(curr_sum, sum_freq.getOrDefault(curr_sum, 0) + 1);
        }

        return count;
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int tar = Integer.parseInt(br.readLine());
            Solution obj = new Solution();
            int res = obj.subArraySum(arr, tar);

            System.out.println(res);
            // System.out.println("~");
        }
    }
}
// } Driver Code Ends