class Solution {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head;

        // Find the last node (5)
        while (temp.next != null) {
            temp = temp.next;
        }

        ListNode last = temp;

        // Move first nodes after node 5
        while (head != last) {

            temp = head;           // Take first node
            head = head.next;      // Move head forward

            temp.next = last.next; // Connect removed node
            last.next = temp;      // Insert immediately after 5
        }

        return last;
    }
}
