import java.util.LinkedList;
import java.util.Queue;

public class 树形结构层次打印 {
    public static void main(String[] args) {
        printTreeNodesByLayer(new int[]{1,2,1,0,1,0,0,1});
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
