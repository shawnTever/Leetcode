package sort;

import java.util.Arrays;

public class BubbleSort {
//    时间复杂度n2，空间复杂度1
//    稳定
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 9, 16, 5, 7, 8, 11, 15};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
