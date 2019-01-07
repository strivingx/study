package test;

import util.Util;

import java.util.LinkedList;
import java.util.Queue;

public class Count1 {
    public static void main(String[] args) {
        // System.out.println(count1(112));
        // System.out.println(count1(-1));
        // System.out.println(count1(0));
        // System.out.println(count1(-0));
        int[] data = new int[] {1, 2, 3, 4, 5, 6};
        adjust(data);
        Util.println(data);
        printTreeNodesByLayer(new int[]{1,2,1,0,1,0,0,1});
    }

    // 求二进制1的个数
    public static int count1(long val) {
        int count = 0;
        while (val != 0) {
            val = val & (val - 1);
            System.out.println(val);
            count++;
        }
        return count;
    }

    // 1,2,3,4,5,6,7    将奇数移到左边，偶数移到右边
    public static void adjust(int[] data) {
        int i = 0, j = 0;
        while (true) {
            while (j < data.length && data[j] % 2 == 0) j++;
            if (j < data.length) {
                for (int k = j; k > i; k--) {
                    swap(data, k, k - 1);
                }
                j++;
                i++;
            } else {
                break;
            }
        }
    }

    private static void swap(int[] data, int i, int j) {
        int t = data[i];
        data[i] = data[j];
        data[j] = t;
    }

    public static void printTreeNodesByLayer(int[] data) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                int node = queue.poll();
                System.out.print(data[node] + "---");
                if(node * 2 + 1 < data.length && data[node * 2 + 1] != 0) queue.offer(node * 2 + 1);
                if(node * 2 + 2 < data.length && data[node * 2 + 2] != 0) queue.offer(node * 2 + 2);
            }
            System.out.println();
        }
    }
}
