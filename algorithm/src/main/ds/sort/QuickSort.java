package sort;

import util.Util;

public class QuickSort {

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 6, 856, 5456, 35, 23, 542, 4, 5, 556, 435, 2};
        quickSort(data);
        Util.println(data);
    }

    public static void quickSort(int[] data) {
        if (data == null || data.length <= 1) return;
        quickSort(data, 0, data.length - 1);
    }

    public static void quickSort(int[] data, int left, int right) {
        if (left >= right) return;
        int p = partition(data, left, right);
        quickSort(data, left, p - 1);
        quickSort(data, p + 1, right);
    }

    public static int partition(int[] data, int left, int right) {
        int sel = select(data, left, right);
        Util.swap(data, left, sel);
        int selVal = data[left];
        int i = left + 1, j = right;
        while (i < j) {
            while (i < j && data[i] <= selVal) i++;
            while (i <= j && data[j] > selVal) j--;
            System.out.println(i + " " + j);
            if (i < j) Util.swap(data, i, j);
        }
        Util.swap(data, left, j);
        Util.println(data);
        return j;
    }


    private static int select(int[] data, int left, int right) {
        return left;
    }

}
