import java.util.*;

public class _15_threeSum {

    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(target - num))
                return new int[]{target - num, num};
            set.add(num);
        }
        return null;
    }

//    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> result = new ArrayList<>();
//        int[] newNums = new int[nums.length-1];
//        for (int i = 0; i < nums.length; i++) {
//            if(i > 0 && nums[i] == nums[i-1]) continue;
//            for (int j = 0; j < nums.length - 1; j++) {
//                if (j < i)
//                    newNums[j] = nums[j];
//                else
//                    newNums[j] = nums[j + 1];
//            }
//            if (twoSum(newNums, -nums[i]) != null) {
//                List<Integer> threeSum = new ArrayList<>();
//                threeSum.add(nums[i]);
//                for (int n : twoSum(newNums, -nums[i]))
//                    threeSum.add(n);
//                Collections.sort(threeSum);
//                if (!result.contains(threeSum))
//                    result.add(threeSum);
//            }
//        }
//        return result;
//    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            int pointerL = i + 1;
            int pointerR = len - 1;
            if (nums[i] > 0) return result;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (pointerL < pointerR) {
                int sum = nums[i] + nums[pointerL] + nums[pointerR];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i] , nums[pointerL] , nums[pointerR]));
                    while (pointerL < pointerR && nums[pointerL] == nums[pointerL + 1]) pointerL++;
                    while (pointerL < pointerR && nums[pointerR] == nums[pointerR - 1]) pointerR--;
                    pointerL++;
                    pointerR--;
                }
                else if (sum < 0) pointerL++;
                else pointerR--;
            }
        }
        return result;
    }

        public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int target = 18;
        int[] position = twoSum(nums, target);
        System.out.println(Arrays.toString(position));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(threeSum(nums));
    }
}
