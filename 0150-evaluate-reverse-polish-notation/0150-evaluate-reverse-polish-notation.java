 
public class Solution
{
    public int evalRPN(String[] tokens)
    {
        //You can code here
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