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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode current = new ListNode();

        while (list1 != null || list2 != null) {
            if (list1 == null) {
                if (head == null) {
                    return list2;
                }
                current.next = list2;
                break;
            } else if (list2 == null) {
                if (head == null) {
                    return list1;
                }
                current.next = list1;
                break;
            } else if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            if (head == null) {
                head = current.next;
            }
                    
            current = current.next;
        }
        
        return head;
    }
}