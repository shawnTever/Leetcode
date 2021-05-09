import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExamWangyi {

    public int bestSubCollection (int[] nums, int k) {
        // write code here
        int sum = nums[0];
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                sum = Math.max(Math.max(nums[i] + nums[j], nums[i]), sum);
                if (sum % k == 0 && sum > max) max = sum;
            }
        }
        return max;

    }

//    public int[] sub (int[] nums, int k, List<List<Integer>> arrayList) {
//        if (nums.length == 1) arrayList.add(Arrays.asList(nums[0]));
//        else {
//            sub(Arrays.copyOf(nums, nums.length - 1), k, arrayList);
//            int size = arrayList.size();
//            arrayList.add(Arrays.asList(nums[nums.length - 1]));
//        }
//
//    }

//    public String getTop2Str (String rawStr) {
//        // write code here
//        ArrayList<String> arrayList = new ArrayList<>();
//        for (int i = 0; i < rawStr.length(); i++) {
//            arrayList.add(rawStr.substring(i, i + 1));
//            for (int j = 0; j < i; j++) {
//                arrayList.add(rawStr.substring(j, i + 1));
//            }
//        }
//        String[] strings = new String[arrayList.size()];
//        for (int i = 0; i < arrayList.size(); i++)
//            strings[i] = arrayList.get(i);
//        Arrays.sort(strings);
//        return strings[strings.length - 2];
//    }

//    public int[] getColMax (TreeNode root) {
//        // write code here
//
//    }
}
