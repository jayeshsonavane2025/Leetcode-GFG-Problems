class Solution {
	public int rob(int[] nums) {
		int n = nums.length;
		int[] include = new int[n];
		int[] exclude = new int[n];
		include[0] = nums[0];
		exclude[0] = 0;
		for (int i = 1; i < n; i++) {
			include[i] = nums[i] + exclude[i - 1];
			exclude[i] = Math.max(include[i - 1], exclude[i - 1]);
		}
		return Math.max(include[n - 1], exclude[n - 1]);
	}
}