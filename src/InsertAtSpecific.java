/**
 * Created by Yasha on 21-07-2016.
 */

/*
  Insert Node at a given position in a linked list
  head can be NULL
  First element in the linked list is at position 0
  Node is defined as */
  class Node {
     int data;
     Node next;
  }



public class InsertAtSpecific {

    Node InsertNth(Node head, int data, int position) {
        Node new_node = new Node();
        new_node.data = data;
        Node currNode = head;
        Node prevNode = head;
        if(head == null)
        {head = new_node; head.next=null; return head;}

        if(position == 0)
        { new_node.next =head;
            head= new_node;
            return head; }


        for(int i =0 ; i<position;i++)
            currNode= currNode.next;
        for(int i =0 ; i<(position-1) ;i++)
            prevNode= prevNode.next;

        prevNode.next =  new_node;
        new_node.next = currNode;

        return head;
        // This is a "method-only" submission.
        // You only need to complete this method.
    }



}
