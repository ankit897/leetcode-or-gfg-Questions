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
    public ListNode removeNodes(ListNode head) {
      ArrayList<Integer> a = new ArrayList<>();
      ListNode temp = head;
      while(temp!=null){
          a.add(temp.val);
          temp = temp.next;
      }
      int n = a.size();
      ArrayList<Integer> a1 = new ArrayList<>();
      int max = 0;
      for(int i = n-1;i>=0;i--){
         if(a.get(i)>=max){
             a1.add(a.get(i));
             max = a.get(i);
         }
    }
    Collections.reverse(a1);
    ListNode res = new ListNode(0);
    ListNode as = res;
    for(int i =0;i<a1.size();i++){
        as.next = new ListNode(a1.get(i));
        as = as.next;
    }
    return res.next;
    }
}