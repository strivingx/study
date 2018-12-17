package sort;

import util.Util;

/**
 * https://blog.csdn.net/YuZhiHui_No1/article/details/44258297
 * 堆排序（从小到大）分为两步骤：
 * 1. 堆初始化，初始化为大顶堆　　时间复杂度O(n)
 * 2. 对堆进行排序   时间复杂度O(ｎlogn)
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 6, 856, 5456, 35, 23, 542, 4, 5, 556, 435, 2};
        Util.println(data);
        sort(data);
        Util.println(data);
    }

    public static void sort(int[] data) {
        if(data == null || data.length <=1) return ;
        makeHeap(data);
        heapSort(data);
    }

    public static void makeHeap(int[] data) { // 从小到大排序需要大顶堆
        for (int i = (data.length >> 1) - 1; i >= 0; i--) {
            updateUpToDown1(data, i, data.length);
        }
        Util.println(data);
    }

    public static void heapSort(int[] data) {
        for (int i = data.length - 1; i > 0; i--) {
            swap(data, 0, i);
            updateUpToDown1(data, 0, i);
        }
    }

    static void swap(int[] data, int i, int j) {
        int t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    public static void updateUpToDown(int[] data, int current, int len){
        int left = (current << 1) + 1;
        while (left < len) { // 存在左
            int right = left + 1;
            int max = (right < len && data[right] > data[left]) ? right : left;
            if (data[current] < data[max]) {
                swap(data, current, max);
                current = max;
                left = (current << 1) + 1;
                Util.println(data);
            } else {
                break;
            }
        }
    }

    public static void updateUpToDown1(int[] data, int current, int len){
        int temp = data[current];
        int child = (current << 1) + 1;
        while (child < len) { // 存在左
            if(child + 1 < len && data[child + 1] > data[child]) child++;
            if (temp < data[child]) {
                data[current] = data[child];
                current = child;
                child = (current << 1) + 1;
                Util.println(data);
            } else {
                break;
            }
        }
        data[current] = temp;
    }

}
