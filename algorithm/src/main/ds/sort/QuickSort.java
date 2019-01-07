package sort;

import util.Util;

import java.util.Stack;

public class QuickSort {

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 6, 856, 5456, 35, 23, 542, 4, 5, 556, 435, 2};
        quickSort(data);
        Util.println(data);

        data = new int[]{6, 2, 4, 1, 856, 5456, 35, 542, 23,  4, 5, 556, 435, 2};
        quickSort1(data);
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
            // System.out.println(i + " " + j);
            if (i < j) Util.swap(data, i, j);
        }
        Util.swap(data, left, j);
        // Util.println(data);
        return j;
    }

    // 从前往后遍历，指针i+1标识不小于基准的    指针j标识不大于基准的下标，交换两者的值
    //  1,2,1,1,1,1,1,1,1,1,1,1,1,1这种情况交换过多
    public static int partition1(int[] data, int left, int right) {
        int sel = select(data, left, right);
        Util.swap(data, left, sel);
        int selVal = data[left];
        int i = left, j = left + 1;
        while (j <= right) {
            while (j <= right && data[j] >= selVal) j++;
            if (j <= right) {
                Util.swap(data, ++i, j++);
            }
        }
        Util.swap(data, left, i);
        return i;
    }


    private static int select(int[] data, int left, int right) {
        return left;
    }

    /**
     * 非递归实现快排
     * @param data
     */
    public static void quickSort1(int[] data) {
        if (data == null || data.length <= 1) return;
        Stack<Integer> stack = new Stack<Integer>();
        push(stack, 0, data.length - 1);
        while (!stack.isEmpty()) {
            int left = stack.pop();
            int right = stack.pop();
            int mid = partition1(data, left, right);
            if (mid - 1 > left) push(stack, left, mid - 1);
            if (mid + 1 < right) push(stack, mid + 1, right);
        }
    }

    private static void push(Stack<Integer> stack, int left, int right){
        stack.push(right);
        stack.push(left);
    }

}
