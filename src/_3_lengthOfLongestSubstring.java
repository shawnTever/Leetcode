//this is exhaustion method still have other methods

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _3_lengthOfLongestSubstring {
//    public int lengthOfLongestSubstring(String s) {
//        Map<Character, Integer> map = new HashMap<>();
//        int max = 0;
//        int left = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                left = Math.max(map.get(s.charAt(i)) + 1, left);
//            }
//            map.put(s.charAt(i), i);
//            max = Math.max(max, i - left + 1);
//        }
//        return max;
//    }
    public int lengthOfLongestSubstring(String s) {
        int left;
        int right;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            left = i;
            right = i;
            Set<Character> set = new HashSet<>();
            while (right < s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
            }
            max = Math.max(right - left, max);
        }
        return max;
    }

    public static void main(String[] args) {
        _3_lengthOfLongestSubstring substring = new _3_lengthOfLongestSubstring();
//        String s = "pwwkew";
        String s = "aaccmc";
        System.out.println(substring.lengthOfLongestSubstring(s));
    }
}
