class Solution {
    public String longestCommonPrefix(String[] str) {
      //You can code here
      Arrays.sort(str);
      int index=0;
      String s1=str[0];
      String s2=str[str.length-1];
      while(index<s1.length() && index<s2.length()){
        if(s1.charAt(index)==s2.charAt(index))
          index++;
        else
          break;
      }
      return s1.substring(0,index);
 
      
    }
}