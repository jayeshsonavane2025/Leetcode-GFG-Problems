//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    System.out.println(new Solution().evaluatePostFix(br.readLine().trim()));
		}
	}
}
// } Driver Code Ends
class Solution
{
    public int evaluatePostFix(String s)
    {
        //You can code here
        String[] tokens=s.split("");
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        int result=0;
        for(String token:tokens){
          if(isOperator(token)){
            int second=stack.pop();
            int first=stack.pop();
            switch(token){
              case "+":
                  result=first+second;
                  break;
              case "-":
                  result=first-second;
                  break;
              case "*":
                  result=first*second;
                  break;
              case "/":
                  result=first/second;
                  break;
              case "^":
                  result=(int)Math.pow(first,second); 
                  break;
            }
            stack.push(result);
            }
            else{
              stack.push(Integer.parseInt(token));
            }
            
          }
          return stack.pop();
      
    }
    public static boolean isOperator(String s){
      if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("^")){
        return true;
      }
      return false;
    }
}