import java.util.HashMap;
import java.util.Map;

public class Unsolved_76_MinimumWindowSubstring {

    Map<Character, Integer> ori = new HashMap<Character, Integer>();
    Map<Character, Integer> cnt = new HashMap<Character, Integer>();

    public String minWindow(String s, String t) {
        return s;
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        Unsolved_76_MinimumWindowSubstring substring = new Unsolved_76_MinimumWindowSubstring();
        System.out.println(substring.minWindow(s, t));
    }
}
