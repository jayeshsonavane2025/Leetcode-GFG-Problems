class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         int length = nums.length;
        int[] result = new int[length - k + 1];
        int right = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < length; i ++) {
            while (!dq.isEmpty() && dq.peekFirst() < i - k + 1) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.addLast(i);
            if (i >= k - 1) {
                result[right] = nums[dq.peekFirst()];
                right++;
            }
        }
        return result;
    }
}