/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
         ListNode temp = head;
        int count = 0;

        // Count total nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int[] arr = new int[count];

        // Store values in array
        temp = head;

        for (int i = 0; i < count; i++) {
            arr[i] = temp.val;
            temp = temp.next;
        }

        // Check palindrome
        for (int i = 0; i < count / 2; i++) {
            if (arr[i] != arr[count - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}