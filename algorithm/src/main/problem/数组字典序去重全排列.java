import static util.Util.println;
import static util.Util.swap;

import java.util.Arrays;

// 全排列，有序，去重
public class 数组字典序去重全排列 {
    public static void main(String[] args) {
        permutation("abc".toCharArray());
        permutation("abbc".toCharArray());
    }

    public static void permutation(char[] chars) {
        Arrays.sort(chars);
        dfs(chars, 0);
    }

    public static void dfs(char[] chars, int index) {
        if (index >= chars.length) {
            println(chars);
            return;
        }
        for (int i = index; i < chars.length; i++) {
            if (!isDuplicated(chars, i)) { // 只对最后一个重复元素进行排序
                // 与index元素交换，并保证index之后的元素是有序的
                swap(chars, index, i);
                int j = i;
                while (j > index + 1) swap(chars, j, --j);

                dfs(chars, index + 1);

                // 恢复原始排序
                j = index + 1;
                while (j < i) swap(chars, j, ++j);
                swap(chars, index, i);
            }
        }
    }

    // 以i开始之后是否有重复元素
    private static boolean isDuplicated(char[] chars, int i) {
        for (int k = i + 1; k < chars.length; k++) {
            if (chars[i] == chars[k])
                return true;
        }
        return false;
    }
}
