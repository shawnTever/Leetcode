public class _191_offer15_hammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        int one = 1;
        for (int i = 0; i < 32; i++) {
            if ((one & n) != 0) count ++;
            one = one << 1;
        }
        return count;
    }
}
