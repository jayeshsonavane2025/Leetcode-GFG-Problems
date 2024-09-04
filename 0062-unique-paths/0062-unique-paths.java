// class Solution {
//     public int uniquePaths(int m, int n) {
// 		// base case
//         if(m == 1 || n == 1) return 1; 
          
//         // move up
//         int up = uniquePaths(m-1, n);
// 		// move left
//         int left = uniquePaths(m, n-1);
//         return up + left;
//     }
// }

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n ; j++){
                if(i == 0 || j == 0)
                    dp[i][j] = 1;
                else
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m-1][n-1];
    }
}