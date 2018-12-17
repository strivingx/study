package sort;

import util.Util;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 6, 856, 5456, 35, 23, 542, 4, 5, 556, 435, 2};
        sort(data);
        Util.println(data);
    }

    public static void sort(int[] data) {
        if (data == null || data.length <= 1) return;
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[minIndex] > data[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Util.swap(data, i, minIndex);
            }
        }
    }

}
