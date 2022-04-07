package sort;

import java.util.Arrays;

public class InsertSort {
//    从第二个数开始，与之前所有数字比较，
//    如果较小就互换直到插入到不小于前一个数的位置
//    以此循环直到数组最后一个数
//    时间复杂度n2，空间复杂度1
//    稳定

    private static void insertSort(int[] arr) {
        if (arr != null && arr.length >= 2) {
            for (int i = 1; i < arr.length; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 9, 16, 5, 7, 8, 11, 15};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
