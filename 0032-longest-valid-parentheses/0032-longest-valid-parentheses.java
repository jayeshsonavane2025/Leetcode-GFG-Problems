class Solution {
    public int longestValidParentheses(String S) {
        Stack<Character> ct = new Stack<>();
        Stack<Integer> index = new Stack<>();
        index.push(-1);
        int max = 0;
        
        for(int i = 0 ; i< S.length() ; i++){
            
            if(S.charAt(i) == '('){
                
                ct.push('(');
                index.push(i);
                
            }
            else {
                
                if(!ct.isEmpty() && ct.peek() == '(' ){
                    ct.pop();
                    index.pop();
                     max = Math.max(max , i  - index.peek());
                }
                else {
                    ct.push(')');
                    index.push(i);
                }
            }
        }
        return max;  
    }
}