class Solution {
    public int shortestSubarray(int[] A, int K) {
        int n = A.length;
     
        int[] pfxSum = new int[n+1];
        for (int i = 0; i < n; i++) {
            pfxSum[i+1] = pfxSum[i] + A[i];
        } 
        int res = Integer.MAX_VALUE;
        Deque<Integer> deque = new LinkedList<>();

        for (int k = 0; k < n; k++) {
            deque.offerLast(k);    // k itself is a valid starting index for ending index k
            
            while (!deque.isEmpty() && pfxSum[k+1] - pfxSum[deque.peekLast()] <= 0) {
                deque.pollLast();
            }
            
            while (!deque.isEmpty() && pfxSum[k+1] - pfxSum[deque.peekFirst()] >= K) {
                res = Math.min(res, k - deque.pollFirst() + 1);
            }    
        }
		
        return res == Integer.MAX_VALUE ? -1 : res;   
    }
}