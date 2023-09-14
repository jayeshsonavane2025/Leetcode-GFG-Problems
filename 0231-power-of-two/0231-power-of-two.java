class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)return false;
        boolean result=(n&(n-1))==0;
        return result;
    }
}