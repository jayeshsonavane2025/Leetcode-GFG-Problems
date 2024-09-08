class Solution {
    public int findNonMinOrMax(int[] nums) {
             if(nums.length <= 2) {
                  return -1;
            } 
    
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] < min) {
                    min = nums[i];
                }
                if(nums[i] > max) {
                    max = nums[i];
                }
            }
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] != min && nums[i] != max) {
                    return nums[i];
                }
            }
        
        return -1;
    }
}