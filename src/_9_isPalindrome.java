import java.util.ArrayList;

public class _9_isPalindrome {
//    public Boolean isPalindrome(int x) {
//        String reversedStr = new StringBuilder(Integer.toString(x)).reverse().toString();
//        return Integer.toString(x).equals(reversedStr);
//    }

    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        ArrayList<Character> l = new ArrayList<>();
        for (Character c : s.toCharArray())
            l.add(c);
        return isRetrieve(l);
    }

    public static boolean isRetrieve(ArrayList<Character> l) {
        return recursive(l, 0, l.size() - 1);
    }

    private static boolean recursive(ArrayList<Character> l, int left, int right) {
        boolean retrieve;
        if (l.get(left).equals(l.get(right))) {
            if (left + 1 < right - 1) {
                retrieve = recursive(l, left + 1, right - 1);
                return retrieve;
            }
            else return true;
        } else return false;
    }


    public static void main(String[] args) {
        _9_isPalindrome palindrome = new _9_isPalindrome();
        System.out.println(palindrome.isPalindrome(100001));
    }
}
