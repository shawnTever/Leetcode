import java.util.LinkedList;

public class _239_offer59_maxSlidingWindow {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) return nums;
        LinkedList<Integer> linkedList = new LinkedList<>();
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!linkedList.isEmpty() && nums[i] >= nums[linkedList.peekLast()])
                linkedList.pollLast();
            linkedList.add(i);
            if (linkedList.peekLast() - linkedList.peekFirst() + 1 > k) linkedList.pop();
            if (i >= k - 1 && !linkedList.isEmpty())
                result[i - k + 1] = nums[linkedList.peekFirst()];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,1,2,0,5};
        int k = 3;
        _239_offer59_maxSlidingWindow maxSlidingWindow = new _239_offer59_maxSlidingWindow();
        for (int i : maxSlidingWindow.maxSlidingWindow(nums, k))
            System.out.println(i);
    }
}
