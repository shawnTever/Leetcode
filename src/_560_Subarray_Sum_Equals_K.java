import java.util.HashMap;
import java.util.Map;

public class _560_Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i : nums) {
            pre = pre + i;
            if (map.containsKey(pre - k)) count += map.get(pre - k);
            map.put(pre, map.getOrDefault(pre, 0) + 1);
//            if (map.containsKey(pre)) map.put(pre, map.get(pre) + 1);
//            else map.put(pre, 1);
        }

        return count;
    }
    public static void main(String[] args) {
        _560_Subarray_Sum_Equals_K subarray = new _560_Subarray_Sum_Equals_K();
        int[] nums = new int[]{3, 4, 7, 2 , -3, 1, 4, 2};
        int k = 7;
        System.out.println(subarray.subarraySum(nums, k));
    }
}
