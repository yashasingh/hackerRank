/**
 * Created by Yasha on 21-07-2016.
 */
public class InsertAtTail

        Node Insert(Node head,int data) {

        Node new_node = new Node();
        new_node.data= data;
        if(head == null)
        {

        head.data= data;
        head.next= null;
        return head;
        }
        new_node.next = null;
        Node last = head;
        while(last.next != null)
        last = last.next;

        last.next = new_node;
        return head;
// This is a "method-only" submission.
// You only need to complete this method.

        }


}
