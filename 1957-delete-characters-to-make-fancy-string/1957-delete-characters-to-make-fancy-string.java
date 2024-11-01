class Solution {
    public String makeFancyString(String s) {
        Stack<Character> st=new Stack();
        int count=0;
        for(char c:s.toCharArray()){
           if(!st.isEmpty() && st.peek()==c && count==2){
            //if there are more than 2 characters dont add to stack
            continue;
        }
        
            else if(!st.isEmpty() && st.peek()!=c)
                //if there are different characters then add to stack and change value of count to 1
            {
                st.push(c);
                count=1;
            }
        
            else//else add to stack and increase count
            { 
                st.push(c);
               count++;
        }
    }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}