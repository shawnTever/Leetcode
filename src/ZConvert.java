public class ZConvert {
    public String convert(String s, int numRows) {
        StringBuilder cov = new StringBuilder();
        int len = s.length();
        for (int i = 0; i <= numRows - 1; i++) {
            for (int k = 0; k + i < len; k += 2 * numRows - 2) {
                cov.append(s.charAt(i + k));
                if (i != 0 && i != numRows - 1 && 2 * numRows - 2 + k - i < len) {
                    cov.append(s.charAt(k + 2 * numRows - 2 - i));
                }
            }
        }
        return cov.toString();
    }

    public static void main(String[] args) {
        ZConvert a = new ZConvert();
        String s = "LEETCODEISHIRING";
        int numRows = 3;
        String answer = a.convert(s, numRows);
        System.out.println(answer);
    }
}
