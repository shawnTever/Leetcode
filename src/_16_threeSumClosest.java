import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _16_threeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            int L = i + 1;
            int R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == target) return target;
                else if (sum < target) {
                    if (Math.abs(sum - target) < Math.abs(result - target)) result = sum;
                    L++;
                }
                else {
                    if (Math.abs(sum - target) < Math.abs(result - target)) result = sum;
                    R--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int target = 10;
        System.out.println(threeSumClosest(nums, target));
    }
}
