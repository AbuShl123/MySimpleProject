package leepcode_tasks;

public class AddTwoNumbers_Medium {
    int r = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = 0;
        if (l1 != null) a = l1.val;
        int b = 0;
        if (l2 != null) b = l2.val;
        int val = a + b + r;
        r = 0;
        if (val > 9) {
            r = 1;
            val = val%10;
        }

        if (l1 == null && l2 == null) return val != 0 ? new ListNode(val, null) : null;
        if (l1 == null) return new ListNode(val, addTwoNumbers(null, l2.next));
        if (l2 == null) return new ListNode(val, addTwoNumbers(l1.next, null));
        return new ListNode(val, addTwoNumbers(l1.next, l2.next));
    }
}

class ListNode {
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
