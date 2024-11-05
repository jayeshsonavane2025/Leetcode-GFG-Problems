//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();

            GFG g = new GFG();
            g.rotate(arr);
            printMatrix(arr);

            System.out.println("~");
        }
    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }
}
// } Driver Code Ends




//User function Template for Java
class GFG {
    static void rotate(int mat[][]) {
        // Code Here
        List<List<Integer>> list = new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        for(int i=n-1; i>=0; i--){
            List<Integer> l = new ArrayList<>();
            for(int j=0; j<m; j++){
                l.add(mat[i][j]);
            }
            list.add(l);
        }
        
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<n; j++){
                mat[j][i]=list.get(i).get(j);
            }
        }
    }
}

