package p0019;

class Solution {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode first = temp, second = temp;
        while (n-- >= 0) first = first.next;
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        if (second.next != null) second.next = second.next.next;
        return temp.next;
    }
}