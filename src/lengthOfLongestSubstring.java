import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public boolean allUnique(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return false;
            }
            else {
                set.add(ch);
            }
//            System.out.println(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring substring = new lengthOfLongestSubstring();
        String s = "opsacbabcfddvgd";
        int ans = 0;
        for (int i = 0; i <= s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (substring.allUnique(s.substring(i, j))) {
                    ans = Math.max(ans, j - i);
                }
            }
        }
        System.out.println(ans);
    }
}
