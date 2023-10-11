class Solution {
   public int minNumberOperations(int[] target) { 
	Deque<Integer> stack = new ArrayDeque<>();
	int n = target.length;
	int ans = target[0];
	for(int i = 0 ; i < n ; i ++) {
		while(!stack.isEmpty() && target[stack.peek()] < target[i]) {
			ans+= target[i] - target[stack.pop()];
			//clear stack we don't need any other item in it.
			stack.clear();
		}
		stack.push(i);
	}
	return ans;
}
}