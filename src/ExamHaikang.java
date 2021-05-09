public class ExamHaikang implements people{

    public static void main(String[] args) {
        for (int i = 1000; i < 2000; i++) {
            int j;
            for (j = 2; j <= i / 2 + 1; j++) {
                if (i % j == 0)
                    break;
            }
            if (j == i / 2 + 2)
                System.out.println(i);
        }
    }

}
