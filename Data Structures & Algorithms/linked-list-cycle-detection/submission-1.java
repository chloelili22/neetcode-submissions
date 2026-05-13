/*
Floyd's Tortoise and Hare Algorithm:
The slow pointer moves one step at a time.
The fast pointer moves two steps at a time.
If the linked list has a cycle, the fast pointer will eventually "lap" the slow pointer (i.e., they will meet at some point inside the cycle).
If there is no cycle, the fast pointer will reach the end of the list (i.e., null).


Time Complexity:
O(n), where n is the number of nodes in the linked list. Both the slow and fast pointers traverse the list at most n steps.
Space Complexity:
O(1), since only two additional pointers (slow and fast) are used, making the space complexity constant.
*/


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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;  // slow moves one step at a time
            fast = fast.next.next; // fast moves two steps at a time

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
