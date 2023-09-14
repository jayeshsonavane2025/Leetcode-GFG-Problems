class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer>map=new HashMap<>();
      int n=nums.length;
      int[] a=new int[2];
      for(int i=0;i<n;i++){
        int value=target-nums[i];
        if(map.containsKey(value)){
          a[0]=map.get(value);
          a[1]=i+1;
        }
        map.put(nums[i],i+1);
      }

      return a; 
    }
}