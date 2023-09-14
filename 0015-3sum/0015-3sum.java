class Solution { 
    public List<List<Integer>> threeSum(int[] nums) {
        //You can code here
      Arrays.sort(nums);
      List<List<Integer>> list=new ArrayList<>();
      for(int i=0;i<nums.length-1;i++){
        if(i>0 && nums[i]==nums[i-1])continue;
        List<List<Integer>> temp=twoSum(nums,-nums[i],i+1);
        Iterator it=temp.iterator();
        while(it.hasNext()){
           List<Integer> temp2=(List)it.next();
           temp2.add(0,nums[i]);
           list.add(temp2);
        } 
      }
      return list;
    }
   public List<List<Integer>> twoSum(int[] nums,int target,int i){
     List<List<Integer>> list=new ArrayList<>();
     int start=i;
     int end=nums.length-1;
     while(start<end){
       if(start>i && nums[start]==nums[start-1]){
         start++;
         continue;
       }
       if(end<nums.length-1 && nums[end]==nums[end+1]){
         end--;
         continue;
       }
       int sum=nums[start]+nums[end];
       if(sum==target){
         List<Integer> temp=new ArrayList<>();
         temp.add(nums[start]);
         temp.add(nums[end]);
         list.add(temp);
         start++;
         end--;
         
       }
       else if(sum>target){
         end--;
       }
       else{
         start++;
       }
     }
     return list;
   }
  
}
 