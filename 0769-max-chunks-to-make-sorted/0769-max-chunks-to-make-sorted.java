class Solution {
    public int maxChunksToSorted(int[] arr) {
     int maxTill=0,ans=0,n=arr.length;
      for(int i=0;i<n;i++){
        maxTill=Math.max(maxTill,arr[i]);
        if(maxTill==i)ans++;
      }
      return ans;
    }
}