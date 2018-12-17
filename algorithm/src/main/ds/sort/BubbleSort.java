package sort;

import util.Util;

public class BubbleSort {

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 6, 856, 5456, 35, 23, 542, 4, 5, 556, 435, 2};
        sort(data);
        Util.println(data);
    }

    public static void sort(int[] data) {
        if (data == null || data.length <= 1) return;
        for (int i = 1; i < data.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (data[j] > data[j + 1]) {
                    Util.swap(data, j, j + 1);
                }
            }
            Util.println(data);
        }
    }
}
