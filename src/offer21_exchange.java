public class offer21_exchange {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 == 1) {
                left++;
                continue;
            }
            if (nums[right] % 2 == 0) {
                right--;
                continue;
            }
            int a = nums[left];
            nums[left] = nums[right];
            nums[right] = a;
        }
        return nums;
    }
}
