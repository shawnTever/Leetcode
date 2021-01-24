public class _70_offer11_climbStairs {
    public int climbStairs(int n) {
        int a = 1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }
}
