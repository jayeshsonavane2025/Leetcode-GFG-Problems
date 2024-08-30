//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine = br.readLine().trim();
            String[] inputArray = inputLine.split(" ");
            Vector<String> arr = new Vector<>();
            for (String s : inputArray) {
                arr.addElement(s);
            }

            Solution obj = new Solution();
            System.out.println(obj.removeConsecutiveSame(arr));
        }
    }
}

// } Driver Code Ends



class Solution {
    static int removeConsecutiveSame(Vector <String > v) 
    {
        Stack<String> stack = new Stack<>();
        
        for(String str:v)
        {
            if(!(stack.empty()) && stack.peek().equals(str))
            stack.pop();
            else
            stack.push(str);
        }
        return stack.size();
        
    }
}