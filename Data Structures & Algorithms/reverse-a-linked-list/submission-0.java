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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode nextCurrentV = null;

        /* 
        head = [ 0 ,    1,    2,   3]
        head -> 0 -> 1 -> 2 -> 3 -> null
origin: prev ->current -> next
return: null <- 0 <- 1 <- 2 <- 3 <- head
        prev <- current <- next
        */

        // current reached null, that meand the end of the listNode
        while(current != null) {
            // assign the pointer of current next at first, then we need to shift current
            nextCurrentV = current.next; 
            current.next = prev;
            prev = current;
            current = nextCurrentV;
        }
        return prev;
    }
}
