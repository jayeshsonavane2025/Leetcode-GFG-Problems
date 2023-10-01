class Solution {
    public String reverseWords(String s) {
        char[] charArr=s.toCharArray();
        int start=0;
        int end=0;
        for( end=0;end<=charArr.length;end++){
            if(end==charArr.length || charArr[end] == ' '){
                reverse(charArr,start,end-1);
                start=end+1;
            }
            
        }
        
        return new String(charArr); 
    }
    private static void reverse(char[] charArr,int start,int end){
         while(start<end){
         char temp=charArr[start];
         charArr[start]=charArr[end];
         charArr[end]=temp;
         start++;
         end--;
         }
    }
}