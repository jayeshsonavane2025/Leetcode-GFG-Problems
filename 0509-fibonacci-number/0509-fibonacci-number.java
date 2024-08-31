class Solution {
    public static int fib(int n) {
        if(n==1||n==0)
        {
            return n;
        }  
        int fibonacci= fib(n-1)+fib(n-2);
        return fibonacci;
    }}
 