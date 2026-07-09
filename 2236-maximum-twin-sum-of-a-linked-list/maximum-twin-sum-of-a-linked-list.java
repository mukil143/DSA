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
    public int pairSum(ListNode head) {
        ListNode slow=  head;
        ListNode fast=  head;

        while(fast.next != null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
         
         ListNode temp =slow.next ;
         ListNode prev =null ;
         ListNode next = null ;

         while(temp !=null){
            next = temp.next;
            temp.next = prev;
            prev =temp;
            temp = next;
         }

         

         int max = 0;

         while(prev != null){
            
            max = Math.max(max,head.val+prev.val);
            head = head.next;
            prev = prev.next;
         }

        return max;

    }
}