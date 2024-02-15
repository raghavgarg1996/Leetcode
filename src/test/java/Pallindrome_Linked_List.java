public class Pallindrome_Linked_List {

  /*  public ListNode reverse (ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr !=null) {
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head.next = null;
        head = prev;

        return prev;
    }

    public ListNode findMiddle (ListNode head) {
        ListNode hare = head;
        ListNode turtle = head;

        while (hare.next!=null && hare.next.next!=null) {
            turtle = turtle.next;
            hare = hare.next.next;
        }

        return turtle;
    }

    public boolean isPalindrome(ListNode head) {

        if ((head == null) || head.next == null) {
            return true;
        }

        ListNode middle = findMiddle(head);  // 1st half ka end
        ListNode secondHalfStart = reverse(middle.next);

        ListNode firsthalfStart = head;
        while (secondHalfStart!=null) {
            if (firsthalfStart.val != secondHalfStart.val) {
                return false;
            }
            firsthalfStart = firsthalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }*/

    public static void main(String[] args) {

    }
}
