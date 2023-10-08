class Solution {
    public int findUnsortedSubarray(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int l = -1;
        int r = -1;
        int n = nums.length;
        stack.push(0);
        boolean f = false;
        for ( int i=1; i<n; i++ ) {
            while ( !stack.isEmpty() && nums[stack.peek()]>nums[i] ) {
                f = true;
                if ( l==-1 ) {
                    l = stack.pop();
                } else {
                    l = Math.min(l, stack.pop());
                }
            }
            if ( stack.isEmpty() ) {
                l = 0;
                break;
            }
            stack.push(i);
        }
        if ( !f ) {
            return 0;
        }
        stack.clear();
        stack.push(n-1);
        for ( int i=n-2; i>=0; i-- ) {
            while ( !stack.isEmpty() && nums[stack.peek()]<nums[i] ) {
                r = Math.max(r, stack.pop());
            }
            if ( stack.isEmpty() ) {
                r = n - 1;
                break;
            }
            stack.push(i);
        }
        // System.out.println(l+" "+r);
        return r - l + 1;
    }
}