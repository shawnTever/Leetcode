import java.util.Arrays;

public class _154_offer11_findMin {
//    public int findMin(int[] nums) {
//        Arrays.sort(nums);
//        return nums[0];
//    }

    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (right > left) {
            int mid = (right + left) / 2;
            if (nums[mid] < nums[right]) right = mid;
            else if (nums[mid] > nums[right]) left = mid + 1;
            else right--;
        }
        return nums[left];
    }

//    public int findMin(int[] nums) {
//        int left = 0, right = nums.length - 1;
//
//        while (right > left) {
//            int mid = (right + left) / 2;
//            if (nums[mid] < nums[right]) right = mid;
//            else if (nums[mid] > nums[right]) {
//                if (nums[left] > nums[left + 1]) return nums[left + 1];
//                else
//                    left = mid;
//            } else right--;
//        }
//        return nums[left];
//    }

    public static void main(String[] args) {
        _154_offer11_findMin findMin = new _154_offer11_findMin();
        int[] nums = {3,4,5,6,1,2};
        System.out.println(findMin.findMin(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
