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
        
        // Keep track using three internediate pointers to our listnodes.
        ListNode dummy = head;
        ListNode prev = null;

        while (dummy != null)   {
            System.out.println(dummy.val);
            ListNode temp = dummy.next;
            dummy.next = prev;
            prev = dummy;
            dummy = temp;
            
        }

        // while (prev != null)    {
        //     System.out.println(prev.val);
        //     prev = prev.next;
        // }

        return prev;
    }
}
/*
     d    t
0 -> 1 -> 2 -> 3 -> null

null <- 0

*/