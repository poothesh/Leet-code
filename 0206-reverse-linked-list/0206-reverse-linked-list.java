class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;   // Previous node (initially null)
        ListNode curr = head;   // Current node (starting at head)
        
        while (curr != null) {
            ListNode upc = curr.next;   // Store the next node
            curr.next = prev;           // Reverse the pointer
            prev = curr;                // Move prev forward
            curr = upc;                 // Move curr forward
        }
        
        // At the end of the loop, prev will be the new head of the reversed list
        return prev;
    }
}
