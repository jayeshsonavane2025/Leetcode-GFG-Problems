//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int r = sc.nextInt();
            int c = sc.nextInt();
            
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                 matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix, r, c);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends

 

class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int a[][], int r, int c) {
        ArrayList<Integer> list = new ArrayList<>();

        // Defining boundary conditions
        int left = 0;
        int right = c - 1;
        int top = 0;
        int bottom = r - 1;

        // Applying while conditions are true;
        while (left <= right && top <= bottom) {

            // Traverse right
            for (int i = left; i <= right; i++) {
                list.add(a[top][i]);
            }
            top++;

            // Traverse down
            for (int i = top; i <= bottom; i++) {
                list.add(a[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Traverse left (if there are more rows to traverse)
                for (int i = right; i >= left; i--) {
                    list.add(a[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Traverse up (if there are more columns to traverse)
                for (int i = bottom; i >= top; i--) {
                    list.add(a[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}
