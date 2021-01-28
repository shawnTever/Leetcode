public class _343_offer14_integerBreak {
//    public int integerBreak(int n) {
//        int[] record = new int[n + 1];
//        return recursive(n, record);
//    }
//
//    private int recursive (int n, int[] record) {
//        if (n < 2) return 0;
//        else if (n == 2) return 1;
//        if (record[n] != 0) return record[n];
//        int max = 0;
//        for (int i = 1; i < n - 1; i++) {
//            max =  Math.max(max, Math.max(i * (n - i), i * recursive(n - i, record)));
//        }
//        record[n] = max;
//        return max;
//    }

    public int integerBreak(int n) {
        int[] record = new int[n + 1];
        record[2] = 1;
        for (int i = 3; i <= n; i++) {
            int max = 0;
            for (int j = 1; j < i - 1; j ++) {
                record[i] =  Math.max(max, Math.max(j * (i - j), j * record[i - j]));
                max = record[i];
            }
        }
        return record[n];
    }

    public static void main(String[] args) {
        _343_offer14_integerBreak integerBreak = new _343_offer14_integerBreak();
        System.out.println(integerBreak.integerBreak(10));
    }

}
