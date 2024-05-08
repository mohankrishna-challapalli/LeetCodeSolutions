class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0);
    ListNode curr = dummyHead;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {
      int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
      carry = sum / 10;
      curr.next = new ListNode(sum % 10);
      curr = curr.next;
      l1 = l1 != null ? l1.next : null;
      l2 = l2 != null ? l2.next : null;
    }

    return dummyHead.next;
  }
}
