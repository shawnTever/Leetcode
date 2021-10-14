package quNaEr;

public class quNaEr {
    public static int[] mergeSortedArray(int[] a, int m, int[] b, int n) {
        System.arraycopy(a, 0, b, a.length,a.length + b.length);
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 0, 0, 0};
        int m = 3;
        int[] b = new int[]{2, 4, 6};
        int n = 3;
        for (int i : mergeSortedArray(a,m, b,n))
            System.out.println(i);
    }
}
