public class _53_offer42_maxSubArray {
    public int maxSubArray(int[] nums) {
        int dp = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp = Math.max(nums[i] + dp, nums[i]) ;
            max = Math.max(dp, max);
        }
        return max;
    }

    public static void main(String[] args) {
        _53_offer42_maxSubArray maxSubArray = new _53_offer42_maxSubArray();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray.maxSubArray(nums));
    }
}
