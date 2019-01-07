package test;

import util.Util;
import static util.Util.swap;

public class 奇左偶右 {
    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 3, 4, 5, 6};
        adjust(data);
        Util.println(data);
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

}
