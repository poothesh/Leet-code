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
    public ListNode sortList(ListNode head) {
        if (head == null) return null;

        // Step 1: Calculate the size of the linked list
        int size = 0;
        ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        // Step 2: Populate the array with linked list values
        int[] arr = new int[size];
        current = head; // Reset pointer to head
        for (int i = 0; i < size; i++) {
            arr[i] = current.val;
            current = current.next;
        }

        // Step 3: Sort the array
        Arrays.sort(arr);

        // Step 4: Create a new sorted linked list from the sorted array
        ListNode dummy = new ListNode(0); // Dummy node
        current = dummy;
        for (int value : arr) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next; // Return the sorted linked list
    }
}
