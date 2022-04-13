public class _1143_longestCommonSubsequence {
//    最长公共子序列
//    动态规划
    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null || text1.length() == 0 || text2.length() == 0)
            return 0;
        char[] c1 = text1.toCharArray();
        char[] c2 = text2.toCharArray();
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1][len2];
        dp[0][0] = c1[0] == c2[0]? 1 : 0;
        for (int i = 1; i < len1; i++) {
            dp[i][0] = c1[i] == c2[0]? 1 : dp[i - 1][0];
        }
        for (int j = 1; j < len2; j++) {
            dp[0][j] = c1[0] == c2[j]? 1 : dp[0][j - 1];
        }
        for (int i = 1; i < len1; i++) {
            for (int j = 1; j < len2; j++) {
                int dp1 = dp[i - 1][j];
                int dp2 = dp[i][j - 1];
                int dp3 = c1[i] == c2[j]? (1 + dp[i - 1][j - 1]) : 0;
                dp[i][j] = Math.max(dp1, Math.max(dp2, dp3));
            }
        }
        return dp[len1 - 1][len2 - 1];

    }

    public static void main(String[] args) {
        String s1 = "ace";
        String s2  = "abcde";
        _1143_longestCommonSubsequence longestCommonSubsequence = new _1143_longestCommonSubsequence();
        System.out.println(longestCommonSubsequence.longestCommonSubsequence(s1, s2));
    }
}
