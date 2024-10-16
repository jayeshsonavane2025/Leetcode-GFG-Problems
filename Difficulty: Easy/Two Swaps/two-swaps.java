//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine()); // Read number of test cases

        // Loop through each test case
        while (t-- > 0) {
            String input = scanner.nextLine();
            String[] inputArr = input.split(" ");
            List<Integer> arr = new ArrayList<>();

            // Convert input to list of integers
            for (String str : inputArr) {
                arr.add(Integer.parseInt(str));
            }

            Solution ob = new Solution();
            boolean ans = ob.checkSorted(arr);

            // Output result
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");
        }

        scanner.close();
    }
}

// } Driver Code Ends


class Solution {
    private void swap(List<Integer> arr, int i , int j){
        int temp = arr.get(j);
        arr.set(j,arr.get(i));
        arr.set(i,temp);
    }

    public boolean checkSorted(List<Integer> arr) {
        // code here
        List<Integer> sorted = new ArrayList<>(arr);
        Collections.sort(sorted);
        
        List<Integer> mismatch = new ArrayList<>();
        
        for(int i =0;i<arr.size();i++){
            if(!arr.get(i).equals(sorted.get(i))){
                mismatch.add(i);
            }
        }
        
        if(mismatch.size()==0){
            return true;
        }
        
        if(mismatch.size()==4){
            int i = mismatch.get(0);
            int j = mismatch.get(1);
            int k = mismatch.get(2);
            int l = mismatch.get(3);
            swap(arr,i,l);
            swap(arr,j,k);
            return arr.equals(sorted);
        }
        
        
        return false;
    }
}