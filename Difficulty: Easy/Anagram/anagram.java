//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s1 = br.readLine(); // first string
            String s2 = br.readLine(); // second string

            Solution obj = new Solution();

            if (obj.areAnagrams(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        if(s1.length()!=s2.length()) return false;
        Map<Character,Integer>hp=new HashMap<>();
        Map<Character,Integer>hs=new HashMap<>();
        ane(s1,hp);
        ane(s2,hs);
        return hp.equals(hs);
    }
    public static void ane(String s,Map<Character,Integer>h){
        for(char c:s.toCharArray()) h.put(c,h.getOrDefault(c,0)+1);
    }
}