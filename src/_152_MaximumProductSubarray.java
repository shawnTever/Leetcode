public class _152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int Max = nums[0], Min = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int preMax = Max, preMin = Min;
            Max = Math.max(nums[i], Math.max(nums[i] * preMax, nums[i] * preMin));
            Min = Math.min(nums[i], Math.min(nums[i] * preMax, nums[i] * preMin));
            if (ans < Max) ans = Max;
        }
        return ans;
    }

    public static void main(String[] args) {
        _152_MaximumProductSubarray singleNumber = new _152_MaximumProductSubarray();
        int[] nums = new int[]{2,3,-2,4,0};
        System.out.println(singleNumber.maxProduct(nums));
    }
}
