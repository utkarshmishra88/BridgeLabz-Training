//Leetcode 1721
//Swapping node in a linkedlist.

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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode slow=head;
        ListNode fast=head;
        int length=0;
        while(temp.next!=null)
        {
            temp=temp.next;
            length++;
        }
        
        for(int i=1;i<=k-1;i++)
        {
            slow=slow.next;
        }
        for(int i=1;i<=length-k+1;i++)
        {
            fast=fast.next;
        }
        int tep=slow.val;
        slow.val=fast.val;
        fast.val=tep;
        return head;
    }
}