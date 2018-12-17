package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {0, 1, 2, 2, 2,  2,  2,  2,  2,  2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearchReturnLeft(data, 2));
        System.out.println(binarySearchReturnRight(data, 2));
    }

    public static int binarySearchReturnLeft(int[] data, int val) {
        return binarySearchReturnLeft(data, 0, data.length - 1, val);
    }

    public static int binarySearchReturnLeft(int[] data, int left, int right, int val) {
        while (left <= right) {
            int mid = (left + right) >> 1;
            int midVal = data[mid];
            if (val <= midVal) {
                right = mid - 1;
            } else if (val > midVal) {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int binarySearchReturnRight(int[] data, int val) {
        return binarySearchReturnRight(data, 0, data.length - 1, val);
    }

    public static int binarySearchReturnRight(int[] data, int left, int right, int val) {
        while (left <= right) {
            int mid = (left + right) >> 1;
            int midVal = data[mid];
            if (val < midVal) {
                right = mid - 1;
            } else if (val >= midVal) {
                left = mid + 1;
            }
        }
        return right;
    }


}
