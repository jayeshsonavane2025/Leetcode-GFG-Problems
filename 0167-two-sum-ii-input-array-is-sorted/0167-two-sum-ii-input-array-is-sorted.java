class Solution {
    public int[] twoSum(int[] nums, int target) {
      int sum=0;
      int start=0,end=nums.length-1;
      int[] a=new int[2];
      while(start<end){
          //checking conditions
          //whether it is repeated prev or not
          if(start>0 && nums[start]==nums[start-1]){
              start++;
              continue;
          }
          if(end<nums.length-1 && nums[end]==nums[end+1] ){
              end--;
              continue;
          }
          sum=nums[start]+nums[end];
          
          if(sum==target){
              a[0]=++start;
              a[1]=++end;
              break;
              
          }
          else if(sum>target){
              end--;
          }
          else{
              start++;
          }
          
      }
    return a;
    
    }
}