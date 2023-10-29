class Solution {
    public int singleNumber(int[] a) {
        int ans=0;
         for(int i=0;i<32;i++){
          int cnt=0;
          for(int item:a){
            if((item & 1<<i) != 0){
              cnt++;
            }
          }
          if(cnt % 3 != 0){
            ans|=(1<<i);
          }
         }
         return ans;
    }
}