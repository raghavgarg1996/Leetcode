public class Delete_Middle_Node_Of_Linkedlist {

    // Work only in leetcde
/*    public ListNode deleteMiddle(ListNode head) {

        ListNode currNode  = head;

        int size = 0;
        while (currNode!=null) {
            currNode = currNode.next;
            size++;
        }

        if (head.next==null) {
            return null;
        }

        int prevOfNodeToDelete = (size/2)-1;

        ListNode deleteNode = head;
        int i=0;

        while (i<prevOfNodeToDelete) {
            deleteNode = deleteNode.next;
            i++;
        }

        deleteNode.next = deleteNode.next.next;
        return head;
    }*/
}
