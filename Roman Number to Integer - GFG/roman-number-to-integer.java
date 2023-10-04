//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends



// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
     static int value(char rom)
    { 
        if (rom == 'I')
        return 1;
        if (rom == 'V')
            return 5;
        if (rom == 'X')
            return 10;
        if (rom == 'L')
            return 50;
        if (rom == 'C')
            return 100;
        if (rom == 'D')
            return 500;
        if (rom == 'M')
            return 1000;
        return -1;
    }
    static int romanToDecimal(String str)
    {
         str=str.toUpperCase();
        int sum=0;
        int s1,s2;
        for(int i=0;i<str.length();i++)
        {
             s1=value(str.charAt(i));
            if((i+1)<str.length())
            {
                s2=value(str.charAt(i+1));
                if(s1>=s2)
                {
                    sum=sum+s1;
                }
                else
                    sum=sum-s1;
            }
            else 
                sum=sum+s1;
        }
        return sum;
    }
}