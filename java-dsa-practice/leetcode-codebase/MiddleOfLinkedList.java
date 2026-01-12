//Middle of linkedlist.
//Leetcode 876

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
    public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode temp=head;
        while(temp!=null)
        {
            temp=temp.next;
            length++;
        }
        int mid=length/2+1;
        temp=head;
        for(int i=1;i<mid;i++)
        {
            temp=temp.next;
        }
        return temp;
    }
}