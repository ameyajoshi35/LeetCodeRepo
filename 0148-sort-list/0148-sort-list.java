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
    public ListNode sortList(ListNode head) {

        ListNode curr = head;
        List<Integer> list = new ArrayList();

        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(list);
        curr = head;
        int i = 0;
        while(curr != null){
            curr.val = list.get(i++);
            curr = curr.next;
        }

        return head;
    }
}