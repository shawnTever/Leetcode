public class _10_offer19_isMatch {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] match = new boolean[m + 1][n + 1];
        match[0][0] = true;
        for (int i = 0; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                match[i][j] = isTrue(s, p, i, j, match);
            }
        }
        return match[m][n];
    }

    private boolean isTrue(String s, String p, int i, int j, boolean[][] match) {
        if (i == 0) {
            char col = p.charAt(j - 1);
            if (col == '*') return match[i][j - 2];
            else if (col == '.') return false;
            else return false;
        }
        else {
            char row = s.charAt(i - 1);
            char col = p.charAt(j - 1);
            if (row == col) return match[i - 1][j - 1];
            else if (col == '*') {
                return match[i][j - 2] ||
                        (p.charAt(j - 2) == row && match[i - 1][j]) ||
                        (p.charAt(j - 2) == '.' && match[i - 1][j]);
            }
            else if (col == '.') {
                return match[i - 1][j - 1];
            }
            else
                return false;
        }
    }

    public static void main(String[] args) {
        _10_offer19_isMatch isMatch = new _10_offer19_isMatch();
//        String s = "aaabcaab";
//        String p = "a*b.a*b";
        String s = "ab";
        String p = ".*";
//        int m = s.length();
//        int n = p.length();
//        boolean[][] match = isMatch.isMatch(s, p);
//        for (int i = 0; i < m + 1; i++) {
//            for (int j = 0; j < n + 1; j++) {
//                System.out.print(match[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(isMatch.isMatch(s, p));
    }
}
