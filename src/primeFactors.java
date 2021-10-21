import java.util.Scanner;

public class primeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();


        StringBuilder s = new StringBuilder();

        while (num != 1) {
            long k = (long) Math.sqrt(num);
            for (int i = 2; i <= k; i++) {
                while (num % i == 0) {
                    num = num / i;
                    s.append(i).append(" ");
                }
                k = (long) Math.sqrt(num);
            }
            if (num == 1) break;
            s.append(num).append(" ");
            num = 1;
        }
        System.out.println(s.substring(0, s.length() - 1));

    }
}
