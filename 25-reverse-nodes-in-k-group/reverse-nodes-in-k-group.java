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
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        for(ListNode temp = head;temp != null;temp = temp.next){
            count++;
        }

            ListNode dummy = new ListNode(0);
            dummy.next = head;

            ListNode prevGrpTail = dummy;
            ListNode temp =  head;
            while(count >= k){
                ListNode grpTail = temp;

                ListNode prev = null;
                ListNode next = null;

                for(int  i = 0; i< k ;i++){
                    next = temp.next;
                    temp.next = prev; 
                    prev = temp;
                    temp =  next;
                }

                prevGrpTail.next = prev; 
                
                grpTail.next = temp;

                prevGrpTail = grpTail;

                count  = count - k;
            }

            return dummy.next;
    }
}