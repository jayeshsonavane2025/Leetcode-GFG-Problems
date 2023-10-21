class Solution {
    public boolean isPowerOfThree(int n) {
       long temp=1;
       int i=1;
       while(n>1 && temp<n)
       {
           temp+=temp<<1;
           
       }
       
       return temp==n;
    }
    
}
 