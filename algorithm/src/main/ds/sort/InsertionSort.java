package sort;

import util.Util;

public class InsertionSort {

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 6, 856, 5456, 35, 23, 542, 4, 5, 556, 435, 2};
        sort(data);
        System.out.println(data.length);
        System.out.println(binarySearch(data, 0));
        System.out.println(binarySearch(data, 100000));
        System.out.println(binarySearch(data, 2));
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

    public static int binarySearch(int[] data, int left, int right, int val) {
        while (left <= right) {
            int mid = (left + right) >> 1;
            int midVal = data[mid];
            if (val < midVal) {
                right = mid - 1;
            } else if (val >= midVal) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static int binarySearch(int[] data, int val) {
        return  binarySearch(data, 0, data.length-1, val);
    }
}
