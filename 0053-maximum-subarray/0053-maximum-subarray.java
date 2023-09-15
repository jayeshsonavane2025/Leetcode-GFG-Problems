class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0],curr=nums[0];
        int start=0;
        int maxStart=0;
        int maxEnd=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]>(curr+nums[i])){
                 curr=nums[i];
                start=i;
                
            }
            else{
                curr+=nums[i];
            }
            if(curr>max){
                max=curr;
                maxStart=start;
                maxEnd=i;
                
            }
        }
        return max;
        
    }
}