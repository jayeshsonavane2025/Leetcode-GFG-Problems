class Solution {
    
    public List<Long> minOperations(int[] nums, int[] queries) {
        
        int m = queries.length, n = nums.length;
        int[][] Q = new int[m][2];
        for(int i = 0; i < m; i++){
            Q[i] = new int[]{i, queries[i]};
        }
        Arrays.sort(nums);
        Arrays.sort(Q, (i1, i2) -> {
            return i1[1] - i2[1];
        });
        long total = 0, right = 0;
        for(int i : nums){
            total += i;
        }
        long[] result = new long[m];
        int j = 0;
        for(int i = 0; i < m; i++){
            while(j < n && nums[j] < Q[i][1]){
                right += nums[j];
                j++;
            }
            long left = (total - right);
            long ops = left - (n - j) * 1l * Q[i][1];
            ops += (j * 1l * Q[i][1]) - right;
            result[Q[i][0]] = ops;
        }
        List<Long> list = new ArrayList<>();
        for(int i = 0; i < m; i++){
            list.add(result[i]);
        }
        return list;
    }
}