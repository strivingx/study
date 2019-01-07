package list;

public class MyList {

    public static void main(String[] args) {
        int[] data = new int[] {1, 2, 3, 4, 5};
        Node head = makeList(data);
        head = reverse(head);
        head = reverseDFS(head);
        printList(head);
    }

    /**
     * 链表反转递归实现
     * @param head
     * @return
     */
    public static Node reverseDFS(Node head) {
        if (head == null || head.next == null)
            return head;
        Node h = reverseDFS(head.next);
        head.next.next = head;
        head.next = null;
        return h;
    }

    /**
     * 链表反转非递归实现
     * @param head
     * @return
     */
    public static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node pre = head, cur = head.next, next;
        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        head.next = null;
        return pre;
    }

    public static Node makeList(int[] data) {
        if (data == null || data.length == 0)
            return null;
        Node head = new Node(data[0]);
        Node pre = head;
        for (int i = 1; i < data.length; i++) {
            pre.next = new Node(data[i]);
            pre = pre.next;
        }
        return head;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.println(node);
            node = node.next;
        }
        System.out.println();
    }
}
