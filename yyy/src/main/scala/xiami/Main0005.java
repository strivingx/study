package xiaomi0001;
import java.util.Collections;
import java.util.*;

class Main0005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(solution(sc.nextLine()));
        }
    }

    private static List<Integer> getIntegerList(String line) {
        String[] array = line.split(",");
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(Integer.parseInt(array[i]));
        }
        return list;
    }
    private static String solution(String line) {
        if(line.equals("")) return "";
        // 在此处理单行数据
        List<Integer> list = getIntegerList(line);
        Collections.sort(list);
        // 返回处理后的结果
        return list.size() == 0 ? "" :Integer.toString(list.get(list.size() / 2));
    }
}