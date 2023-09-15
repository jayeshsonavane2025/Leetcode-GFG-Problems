class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int n=nums.length;
        int result=Integer.MAX_VALUE;
        int end=0;
        int start=0;
        int sum=0;
        while(end<n){
            sum+=nums[end];
            end++;
            while(sum>=target){
                 result=Math.min(result,end-start);
                 sum-=nums[start++];
                
            }
                
                
        }
        return result==Integer.MAX_VALUE?0:result;
    }
}