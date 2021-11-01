package zoom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class zoom {
    public int lengthOfLongestSubstring (String s) {
        int left;
        int right;
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            left = i;
            right = i;
            Set<Character> set = new HashSet<>();
            while (right < s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }
            maxlen = Math.max(maxlen, right - left);
        }
        return maxlen;
    }

    public ArrayList<ArrayList<Integer>> threeSums (int[] nums, int target) {
        // write code here
        int len = nums.length;
        boolean[] visit = new boolean[nums.length];
        ArrayList<ArrayList<Integer>> threeSums = new ArrayList<>();
        ArrayList<Integer> threeSum = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                if (visit[i]) break;
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    if (visit[i] || visit[r]) break;
                    threeSum.add(nums[i]);
                    threeSum.add(nums[l]);
                    threeSum.add(nums[r]);
                    threeSums.add(threeSum);
                    visit[i] = true;
                    visit[l] = true;
                    visit[r] = true;
                } else if (sum < target) {
                    l++;
                } else r++;
            }
        }

        return threeSums;

    }


}
