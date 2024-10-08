//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends




//User function Template for Java

//User function Template for Java
// class Solution {
//     static long nthFibonacci(long n){
//         // code here
//         if(n<=1) 
//           {return n%1000000007;}
//         return (nthFibonacci(n-1)+nthFibonacci(n-2))%1000000007;
//     } 
// }


class Solution {
    static long nthFibonacci(long n){
        // code here
        long a=0,b=1,c=-1;
        if(n==0||n==1)
        {
            return n;
        }
        for(long i=2;i<=n;i++){
            c=(a+b)%1000000007;
            a=b;
            b=c;
        
        }
        return (c);
    }
}

