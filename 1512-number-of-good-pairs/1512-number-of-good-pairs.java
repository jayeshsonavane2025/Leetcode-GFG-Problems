class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        int n=nums.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j])
                    res++;
            }
        }
        return res;
    }
}