public class _12_intToRoman {

    public String intToRoman(int num) {
        int[] RomanInt = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] values = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String output = "";
        for (int i = 0; i < RomanInt.length; i++) {
            while (num >= RomanInt[i]) {
                output += values[i];
                num -= RomanInt[i];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        _12_intToRoman intToRoman = new _12_intToRoman();
        System.out.println(intToRoman.intToRoman(12));
    }
}
