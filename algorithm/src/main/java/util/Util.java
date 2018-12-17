package util;

public class Util {
    public static void println(int[] data) {
        for (int i : data) {
            System.out.print(i+",");
        }
        System.out.println();
    }

    public static void swap(int[] data, int i, int j) {
        int t = data[i];
        data[i] = data[j];
        data[j] = t;
    }
}
