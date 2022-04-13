public class _5_palindromeSubstring {
    /**
     * @Function_Name: longestPalindrome
     * @NOTE: centre spread
     */
    public String longestPalindrome(String s) {
        int m, n, p;
        String str = "";
        for (int i = 1; i < s.length() - 1; i++) {
            m = i;
            n = m + 1;
            p = m + 2;

            while (m >= 0 && n <= s.length() - 1) {
                if (s.charAt(m) == s.charAt(n)) {
                    m--;
                    n++;
                    if (str.length() < n - m - 1) {
                        str = s.substring(m + 1, n);
//                        System.out.println(str);
                    }
                }
                else {
                    break;
                }
            }
            while (m >= 0 && p <= s.length() - 1) {
                if (s.charAt(m) == s.charAt(p)) {
                    m--;
                    p++;
                    if (str.length() < p - m - 1) {
                        str = s.substring(m + 1, p);
//                        System.out.println(str);
                    }
                }
                else {
                    break;
                }
            }
        }
        return str;
    }

    /**
     * @Function_Name: longestPalindrome1
     * @NOTE: 动态规划
     *        因为s[i]自身为回文串
     *        若s[i - 1] == s[j + 1]，且s.subString(i, j + 1)为回文串
     *        则s.subString(i - 1, j + 2)为回文串。
     *        转换为二维dp中，
     *        dp[i - 1][j + 1] 和 dp[i][j] 状态一样
     *        即dp[i - 1][j + 1] = dp[i][j]
     *        转化成代码即dp[i][j] = dp[i + 1][j - 1]
     */

    public String longestPalindrome1(String s) {
        if (s == null || s.length() == 0) return "";
        char[] ch = s.toCharArray();
        int m = ch.length;
        boolean[][] dp = new boolean[m][m];
        int max = 1;
        String maxString = "";
        for (int i = 0; i < m; i++) {
            dp[i][i] = true;
            maxString = Character.toString(ch[i]);
        }
        for (int j = 1; j < m; j++) {
            for (int i = 0; i < j; i++) {
                if (ch[i] == ch[j]) {
                    if (j - i < 3) dp[i][j] = true;
                    else dp[i][j] = dp[i + 1][j - 1];
                }
                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    maxString = s.substring(i, i + max);
                }
            }
        }
        return maxString;
    }

    /**
     * @Function_Name: longestPalindrome2
     * @NOTE: Manacher
     */
    public String longestPalindrome2(String s) {
        return "";
    }

    public static void main(String[] args) {
        _5_palindromeSubstring pal = new _5_palindromeSubstring();
        String test = "aacabdkacaa";
//        String test = "ab5656";
        String s = pal.longestPalindrome(test);
        String s1 = pal.longestPalindrome1(test);
        System.out.println(s);
        System.out.println(s1);
    }
}
