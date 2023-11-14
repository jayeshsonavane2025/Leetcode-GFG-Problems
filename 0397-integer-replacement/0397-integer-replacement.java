class Solution {
    public int integerReplacement(int n) {
      int cnt = 0;
        while (n > 1) {
            cnt++;
            if ((n & 1) != 0) {
                cnt++;
                n >>= 1;
                if (n != 1 && (n & 1) != 0) n++;
            } else {
                n >>= 1;
            }
        }
        
        return cnt;  
    }
}