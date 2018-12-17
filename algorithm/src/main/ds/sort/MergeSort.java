package sort;

import util.Util;

public class MergeSort {

    public static void main(String[] args) {
        int[] data = {4, 2, 4, 6, 856, 5456, 35, 23, 542, 4, 5, 556, 435, 2};
        sort(data);
        Util.println(data);
    }

    public static void sort(int[] data) {
        if (data == null || data.length <= 1) return;
        sort(data, 0, data.length - 1);
    }

    public static void sort(int[] data, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) >> 1;
        sort(data, left, mid);
        sort(data, mid + 1, right);
        Util.println(data);
        merge(data, left, right);
        Util.println(data);
    }

    public static void merge(int[] data, int left, int right) { // 省一半的内存
        int mid = (left + right) >> 1;
        int len = mid - left + 1;
        int[] temp = new int[len];
        int index = 0;
        while (index < len) {
            temp[index] = data[(index) + left];
            index++;
        }
        int i = 0;
        int j = mid + 1;
        while (i < len && j <= right) {
            data[left++] = temp[i] <= data[j] ? temp[i++] : data[j++];
        }
        while (i < len) data[left++] = temp[i++];
    }

    public static void merge1(int[] data, int left, int right) {
        int mid = (left + right) >> 1;
        int len = right - left + 1;
        int[] temp = new int[len];
        int index = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) temp[index++] = data[i] <= data[j] ? data[i++] : data[j++];
        while (i <= mid) temp[index++] = data[i++];
        while (j <= right) temp[index++] = data[j++];
        index = 0;
        while (index < len) data[left++] = temp[index++];
    }

}
