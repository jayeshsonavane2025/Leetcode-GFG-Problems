class Solution {
    public void helper(int[] nums,int i,List<List<Integer>> list,List<Integer> sublist){
        if(i==nums.length){
            list.add(new ArrayList(sublist));
            return;

        }
        sublist.add(nums[i]);
        helper(nums,i+1,list,sublist);
        sublist.remove(sublist.size()-1);

        helper(nums,i+1,list,sublist);
        return;

    }
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int reccount=0;
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> sublist=new ArrayList<>();
        helper(nums,0,list,sublist);
        return list;       
    }
}