class Solution {
    public int removeDuplicates(int[] nums) { 
        int res=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[res++]=nums[i];
            }
        }
        return res;
        
    }
}