public class _69_SqrtX {

    public int mySqrt(int x) {
        int a = 0;
        int end = x;
        int ans = (a + end) / 2;
        if (x == 1) {
            ans = 1;
        }
        else {
            while (end - a > 1 && ans * ans != x) {
                if ((long) ans * ans < x) {
                    a = ans;
                }
                else {
                    end = ans;
                }
                ans = (a + end) / 2;
            }
        }

        return ans;

//        int l = 0, r = x, ans = -1;
//        while (l <= r) {
//            int mid = l + (r - l) / 2;
//            if ((long)mid * mid <= x) {
//                ans = mid;
//                l = mid + 1;
//            }
//            else {
//                r = mid - 1;
//            }
//        }
//        return ans;

    }

    public static void main(String[] args) {
        _69_SqrtX sqrtX = new _69_SqrtX();
        for (int i = 0; i <= 2000; i++) {
            System.out.println(i + " should be:" + (int)Math.sqrt(i) + " get:" + sqrtX.mySqrt(i)
                   + " " + ((int) Math.sqrt(i) == sqrtX.mySqrt(i)));
        }

    }
}
