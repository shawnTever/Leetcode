import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sumnum {

    public static int[] twoSum(int[] nums, int target) {
        for (int n = 0; n < nums.length; n++) {
            for (int m = nums.length - 1; m > n; m--) {
                if (target == nums[n] + nums[m]){
                    return new int[]{n, m};
                }
            }
        }
        return null;
    }

    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++){
            int find = target - nums[j];
            if (map.containsKey(find) && (find != nums[j])) {
                return new int[]{j, map.get(find)};
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++){
            map.put(nums[j], j);
            int find = target - nums[j];
            if (map.containsKey(find) && (find != nums[j])) {
                return new int[]{j, map.get(find)};
            }
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 18;
        int target1 = 18;
        int[] position = twoSum(nums, target);
        int[] position1 = twoSum1(nums, target1);
        int[] position2 = twoSum2(nums, target);
        System.out.println(Arrays.toString(position));
        System.out.println(Arrays.toString(position1));
        System.out.println(Arrays.toString(position2));
    }
}
