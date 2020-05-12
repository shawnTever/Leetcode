import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _50_Power {

//    private double quickMul(double x, int n) {
//        if (n == 0) {
//            return 1;
//        } else {
//            double y = quickMul(x, n / 2);
//            if (n % 2 == 0) {
//                return y * y;
//            }
//            else {
//                return y * y * x;
//            }
//        }
//    }
//
//    public double myPow(double x, int n) {
//        return n > 0? quickMul(x, n) : 1.0 / quickMul(x, -n);
//
//    }


//    public double myPow(double x, long n) {
//        double ans = 1.0;
//        double contribution = x;
//        long N;
//
//        if (n > 0) N = n;
//        else N = -n;
//
//        while (N != 0) {
//            if (N % 2 == 1) {
//                ans = ans * contribution;
//            }
//            contribution = contribution * contribution;
//            N = N / 2;
//        }
//
//        return n > 0? ans : (1.0 / ans);
//    }


    private double quickMul(double x, long n) {
        double ans = 1.0;
        double contribution = x;
        long N = n;

        while (N != 0) {
            if (N % 2 != 0) {
                ans = ans * contribution;
            }
            contribution = contribution * contribution;
            N = N / 2;
        }
        return ans;
    }

    public double myPow(double x, int n) {
        return n > 0? quickMul(x, n) : 1.0 / quickMul(x, -n);
    }

    public static void main(String[] args) {
        _50_Power power = new _50_Power();
        System.out.println(power.myPow(2,Integer.MIN_VALUE));
//        String BinN = Integer.toBinaryString(-3);
//        System.out.println(Long.parseLong("BinN"));
    }
}
