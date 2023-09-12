class Solution {
    public boolean isPalindrome(int x) {
         return isPalindromeHelper(x);
    }
    public static boolean isPalindromeHelper(int x){
        if(x<0)return false;
        int temp=x;
        int res=0;
        while(x!=0){
            int rem=x%10;
            res=res*10+rem;
            x/=10;
        }
        return temp==res;
    }
}