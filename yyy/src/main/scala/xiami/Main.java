package xiaomi0001;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());
        }
    }

    private static String solution(String line) {
        // 在此处理单行数据
        String[] array = line.split(" ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int a = Integer.parseInt(array[i]);
            count = count + a;
        }
        String result = Integer.toString(count);
        // 返回处理后的结果
        return result;
    }
}