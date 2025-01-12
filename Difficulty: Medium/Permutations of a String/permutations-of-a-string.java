//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.findPermutation(S);
            for (int i = 0; i < ans.size(); i++) {
                out.print(ans.get(i) + " ");
            }
            out.println();

            out.println("~");
        }
        out.close();
    }
}

// } Driver Code Ends




class Solution {
    public List<String> findPermutation(String S) {
        char[] toChar = S.toCharArray();
        List<String> list = new ArrayList<String>();
        Set<String> ans=new HashSet<String>();
        permute(toChar, ans, 0, S.length() - 1); 
        list.addAll(ans);
        Collections.sort(list);
        return list;
    }
    
    private static void permute(char[]toChar, Set<String> ans, int l, int r) {
        if (l == r) {
            ans.add(new String(toChar));
            return;
        }
        for (int i = l; i <= r; i++) {
        
            swap(toChar, i, l);
            permute(toChar, ans, l + 1, r); 
            swap(toChar, i, l);
        }
    }
    
    private static void swap(char[] toChar, int i, int l) {
        char temp = toChar[i];
        toChar[i] = toChar[l];
        toChar[l] = temp;
    }
}
