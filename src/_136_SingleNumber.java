public class _136_SingleNumber {
    public int singleNumber(int[] nums) {
        int num = 0;
        for (int i : nums) {
            num = i ^ num;
        }
        return num;
    }

    public static void main(String[] args) {
        _136_SingleNumber singleNumber = new _136_SingleNumber();
        int[] nums = new int[]{1,2,1,2};
        System.out.println(singleNumber.singleNumber(nums));
    }
}
