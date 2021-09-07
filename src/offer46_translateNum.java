public class offer46_translateNum {
    public int translateNum(int num) {
        if (num < 10) return 1;
        String s = String.valueOf(num);
        int[] dp = new int[s.length() + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i < s.length() + 1; i++) {
            int sub = Integer.parseInt(s.substring(i - 2, i));
            if (sub <= 25 && sub >= 10)
                dp[i] = dp[i - 1] + dp[i - 2];
            else dp[i] = dp[i - 1];
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        int num = 220;
        offer46_translateNum translateNum = new offer46_translateNum();
        System.out.println(translateNum.translateNum(num));
    }
}
