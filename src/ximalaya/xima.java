package ximalaya;

import java.util.ArrayList;

public class xima {
    public void move(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                for (int j = 0; j < len - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[len - 1] = 0;
            }
        }


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                arrayList.add(nums[i]);
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {

            }
        }
    }

}
