import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18_fourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        if (len < 4 || nums[0] + nums[1] + nums[2] + nums[3] > target)
            return result;
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < len; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int L = j + 1;
                int R = len - 1;
                while (L < R) {
                    int sum = nums[i] + nums[j] + nums[L] + nums[R];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[L], nums[R]));
                        while (L < R && nums[L] == nums[L + 1]) L++;
                        while (L < R && nums[R] == nums[R - 1]) R--;
                        L++;
                        R--;
                    }
                    else if (sum > target) R--;
                    else L++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        _18_fourSum fourSum = new _18_fourSum();
//        int[] nums = new int[]{-1,0,1,2,-1,1};
        int[] nums = new int[]{-2,-1,-1,1,1,2,2};
        int target = 0;
        List<List<Integer>> position = fourSum.fourSum(nums, target);
        for (List<Integer> l : position)
            System.out.println(l.toString());

    }
}
