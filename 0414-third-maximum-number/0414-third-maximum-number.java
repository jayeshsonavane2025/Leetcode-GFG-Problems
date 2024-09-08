public class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }
        
        if(set.size() < 3)
            return set.last();
        
        set.remove(set.last());
        set.remove(set.last());
        return set.last(); //return highest 
    }
}