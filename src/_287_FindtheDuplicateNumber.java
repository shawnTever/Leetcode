public class _287_FindtheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1, r = n - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            int cnt = 0;
            for (int i = 0; i < n; ++i) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }
            if (cnt <= mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
                ans = mid;
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        int[] s = new int[]{1, 3, 4, 2, 2};
        _287_FindtheDuplicateNumber number = new _287_FindtheDuplicateNumber();
        System.out.println(number.findDuplicate(s));
    }
}
