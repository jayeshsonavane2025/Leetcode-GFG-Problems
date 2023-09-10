class Solution {
    public int searchInsert(int[] nums, int target) {
         int start=0,end=nums.length-1,mid  ;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            } 
            else if(nums[mid]<target){
                start=mid+1;  
            } 
            else{
                 end=mid-1; 
            }
                
        }
        return start;
            
    }
}