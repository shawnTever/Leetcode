package sort;

import java.util.Arrays;

public class SelectSort {
//    每次循环找到最小值，并放到第一个位置上
//    时间复杂度n2，空间复杂度1
//    不稳定

    private static void selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) return;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = arr[minIndex] < arr[j] ? minIndex : j;
            }
            int p = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = p;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 9, 16, 5, 7, 8, 11, 15};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
