import java.util.Map;
import java.util.HashMap;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list =new ArrayList<>();
        int major=nums.length/3;
        for(int item:nums){
            map.put(item,map.getOrDefault(item,0) + 1);
        }
         
        for(int item:map.keySet()){
            if(map.get(item)>major){
                list.add(item);
            }
        }
        return list;
    }
} 