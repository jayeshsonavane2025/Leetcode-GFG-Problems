//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans[] = new Solve().printUnsorted(arr, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java
 
class Solve {
    int[] printUnsorted(int[] arr, int n) {
        // code here
        int[] a=new int[n];
        System.arraycopy(arr,0,a,0,n);
        Arrays.sort(arr);
        int[] res=new int[2];
        for(int i=0;i<n;i++){
            if(arr[i]!=a[i]){
                res[0]=i;
                break;
            }
        }
        for(int i=(n-1);i>=0;i--){
            if(arr[i]!=a[i]){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}