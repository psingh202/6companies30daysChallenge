class Solution {
    public int numberOfWays(int startPos, int endPos, int k) {
        int mod = 1000000007;

        int[][] dp = new int[3002][k + 1];
        dp[startPos + 1000][k] = 1;

        for (int i = k - 1; i >= 0; i--) {
            for (int j = 1; j <= 3000; j++) {
                dp[j][i] = ((dp[j][i] + dp[j - 1][i + 1]) % mod + dp[j + 1][i + 1]) % mod;
            }
        }

        return dp[endPos + 1000][0];
    }
}