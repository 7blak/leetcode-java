package p0025_reverse_nodes_in_k_group;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = this;

        while (current != null) {
            sb.append(current.val);
            current = current.next;
        }
        return sb.toString();
    }
}
