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
     * @NOTE: Manacher
     */
    public String longestPalindrome1(String s) {
        return "";
    }

    public static void main(String[] args) {
        _5_palindromeSubstring pal = new _5_palindromeSubstring();
        String test = "cabbacdvadadada";
        String s = pal.longestPalindrome(test);
        System.out.println(s);
    }
}