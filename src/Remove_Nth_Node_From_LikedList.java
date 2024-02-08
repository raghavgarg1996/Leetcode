public class Remove_Nth_Node_From_LikedList {
    // Code will only work on leetcode
  /*  public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next==null) {
            return null;
        }

        //  Size
        int size=0;
        ListNode currNode = head;

        while (currNode!=null) {
            currNode = currNode.next;
            size++;
        }

        if (n==size) {
            return head.next;
        }

        int indexToSearch = size-n;

        ListNode prevNode = head;
        int i=1;
        while (i<indexToSearch) {
            prevNode = prevNode.next;
            i++;
        }

        prevNode.next = prevNode.next.next;
        return head;
    }*/
}
