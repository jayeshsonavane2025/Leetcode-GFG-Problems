class Solution {
    public int maxProfit(int[] p) {
          
        int currMax=p[0];
        int max=Integer.MIN_VALUE;;
        int currMinPrice=p[0];
        int n=p.length;
        for(int i=1;i<n;i++){
            currMax=p[i]-currMinPrice;
            max=Math.max(max,currMax);
            currMinPrice=Math.min(currMinPrice,p[i]);
        } 
        return max>=0?max:0;
    }
}