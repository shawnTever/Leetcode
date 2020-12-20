import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _17_letterCombinations {
    private final static Map<Character, String> phoneMap = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        String combinations = "";
        List<String> result = new ArrayList<>();
        if (digits.length() > 0) {
            iteration(combinations, digits, result);
        }
        return result;
    }

    private static void iteration(String combinations, String subDigits, List<String> result) {
        char number = subDigits.charAt(0);
        StringBuilder combinationsBuilder = new StringBuilder(combinations);
        if (subDigits.length() > 1) {
            for (char c : phoneMap.get(number).toCharArray()) {
                combinationsBuilder.append(c);
                iteration(combinationsBuilder.toString(), subDigits.substring(1), result);
                combinationsBuilder = new StringBuilder(combinations);
            }
        }
        else {
            for (char c : phoneMap.get(number).toCharArray()) {
                combinationsBuilder.append(c);
                result.add(combinationsBuilder.toString());
                combinationsBuilder = new StringBuilder(combinations);
            }
        }

    }

    public static void main(String[] args) {
        _17_letterCombinations letterCombinations = new _17_letterCombinations();
        for (String s : letterCombinations.letterCombinations("234")) {
            System.out.println(s);
        }
    }
}
