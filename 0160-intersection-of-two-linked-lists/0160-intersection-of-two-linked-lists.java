/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a=0,b=0;
        ListNode l1=headA;
        ListNode l2=headB;
        while(l1!=null){
            a++;
            l1=l1.next;
        }
        while(l2!=null){
            b++;
            l2=l2.next;
        }
        while(a>b){
            a--;
            headA=headA.next;
        }
        while(b>a){
            b--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}