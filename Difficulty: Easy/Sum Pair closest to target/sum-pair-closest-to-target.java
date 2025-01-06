//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        if(n==1){
            return list;
        }
        int mindif = Integer.MAX_VALUE;
        int a = 0, b= 0;
        
        int i =0, j=n-1;
        while(i<j){
            int sum = arr[i]+arr[j];
            int diff = Math.abs(target-sum);
            if(mindif > diff){
                mindif = diff;
                a= arr[i];
                b= arr[j];
            }
            if(sum <= target){
                i++;
            }else{
                j--;
            }
        }
        list.add(a);
        list.add(b);
        return list;
    }
}