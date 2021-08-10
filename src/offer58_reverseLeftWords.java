public class offer58_reverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        n = n % s.length();
        String s1 = s + s;
        return s1.substring(n, n + s.length());
    }

}
