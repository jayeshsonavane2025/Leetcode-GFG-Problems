import java.util.*;

public class Solution {
    
    public List<String> generateParenthesis(int n) {
        //You can code here
        List<String> list=new ArrayList<String>();
        solve(list,n,"",0,0,0); 
        return list;
    }
    public static void solve(List<String> list,int n,String str,int i,int open,int close){
      if(i==2*n){
        list.add(str);
      }
      if(open<n){
        str=str+'(';
        solve(list,n,str,i+1,open+1,close);
        str=str.substring(0,str.length()-1);
      }
      if(close<open){
        str=str+')';
        solve(list,n,str,i+1,open,close+1);
        str=str.substring(0,str.length()-1);
      }
    }
}