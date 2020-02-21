public class _9_isPalindrome {
    public Boolean isPalindrome(int x) {
        String reversedStr = new StringBuilder(Integer.toString(x)).reverse().toString();
        return Integer.toString(x).equals(reversedStr);
    }

    public static void main(String[] args) {
        _9_isPalindrome palindrome = new _9_isPalindrome();
        System.out.println(palindrome.isPalindrome(10));
    }
}
