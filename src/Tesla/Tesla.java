package Tesla;

public class Tesla {
    public static int solution(int M, int N) {
        // write your code in Java SE 8
        char[] m = Integer.toBinaryString(M).toCharArray();
        char[] n = Integer.toBinaryString(N).toCharArray();
        int sum = 0;
        for (int i = M; i < Math.pow(2, m.length) ; i++) {
            sum ^= i;
        }
        for (int i = (int)Math.pow(2, n.length - 1); i <= N; i++) {
            sum ^= i;
        }
        return sum;
    }

    public static int solution2(int M, int N) {
        // write your code in Java SE 8
        int sum = 0;
        for (int i = M; i <= N; i++) {
            sum ^= i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(126,127));
        System.out.println(solution2(126,127));
//        System.out.println(Math.pow(2, 3));
    }
}
