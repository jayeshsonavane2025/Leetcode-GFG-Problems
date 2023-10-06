//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        // Your code here
        ArrayDeque<Character> stack= new ArrayDeque<>();
        StringBuilder sb= new StringBuilder();
        for(char ch: exp.toCharArray()){
            if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(stack.peek()!='('){
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else if(isOperator(ch)){
                while(!stack.isEmpty() && precedence(ch)<= precedence(stack.peek())){
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
            else{
                sb.append(ch);
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
    
    static boolean isOperator(char ch){
        return ch=='+' || ch=='-' || ch== '*' || ch=='/' || ch=='^';
    }
    static int precedence(char ch){
        if(ch=='+' || ch=='-') return 1;
        if(ch=='*' || ch=='/') return 2;
        if(ch=='^') return 3;
        return -1;
    }
}