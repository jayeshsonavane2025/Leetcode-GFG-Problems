class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> b-a);
        for(int item:nums){
            pq.add(item);
        }
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.poll();
        
         
    }
}